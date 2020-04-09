package kr.ac.kaist.ires.parser

import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.{ DEBUG_PARSER, DEBUG_SEMI_INSERT, LINE_SEP }
import scala.collection.mutable
import scala.language.reflectiveCalls
import scala.util.parsing.input._

trait LAParsers extends Lexer {
  // failed parser
  val failed: Parser[Nothing] = failure("")

  // first terms
  case class FirstTerms(
      possibleEmpty: Boolean = false,
      ts: Set[String] = Set(),
      nts: Map[String, Lexer] = Map()
  ) {
    def makeEmptyPossible: FirstTerms = copy(possibleEmpty = true)
    def +(that: FirstTerms): FirstTerms = FirstTerms(
      this.possibleEmpty || that.possibleEmpty,
      this.ts ++ that.ts,
      this.nts ++ that.nts
    )
    def +(t: String): FirstTerms = copy(ts = ts + t)
    def +(nt: (String, Lexer)): FirstTerms = copy(nts = nts + nt)
    def ~(that: => FirstTerms): FirstTerms = if (!possibleEmpty) this else FirstTerms(
      that.possibleEmpty,
      this.ts ++ that.ts,
      this.nts ++ that.nts
    )
    lazy val parser: Lexer = Skip ~> Parser { rawIn =>
      val base =
        if (possibleEmpty) phrase("")
        else failed
      val t = TERMINAL.filter(ts contains _)
      record(
        nts.foldLeft(base | t)(_ | _._2),
        rawIn.asInstanceOf[EPackratReader[Char]]
      )
    }
    override def toString: String = (ts.map("\"" + _ + "\"") ++ nts.map(_._1) ++ (if (possibleEmpty) List("ε") else Nil)).mkString("[", ", ", "]")
  }

  // empty first terms
  val emptyFirst: FirstTerms = FirstTerms(possibleEmpty = true)

  //  no first terms
  val noFirst: FirstTerms = FirstTerms()

  // lookahead parsers
  trait LAParser[+T] {
    def parser: FirstTerms => Parser[T]
    protected def getFirst: FirstTerms

    private var visited = false
    private var firstCache: FirstTerms = noFirst
    def first: FirstTerms = {
      if (!visited) { visited = true; firstCache = getFirst }
      firstCache
    }

    def apply(follow: FirstTerms, in: EPackratReader[Char]): ParseResult[T] =
      parse(parser(follow), in)

    def ~[U](that: LAParser[U]): LAParser[T ~ U] = LASeq(this, that)
    def <~[U](that: LAParser[U]): LAParser[T] = LASeqLeft(this, that)
    def |[U >: T](that: LAParser[U]): LAParser[U] = {
      if (this eq MISMATCH) that
      else if (that eq MISMATCH) this
      else LAOr(this, that)
    }
    def ^^[U](f: T => U): LAParser[U] = LAMap(this, f)
    def ^^^[U](v: => U): LAParser[U] = LAValue(this, () => v)
    def unary_-(): LAParser[Unit] = LANotPred(this)
    def unary_+(): LAParser[T] = LAAndPred(this)
  }

  case class LASeq[T, U](left: LAParser[T], right: LAParser[U]) extends LAParser[T ~ U] {
    lazy val parser = follow => left.parser(right.first ~ follow) ~ right.parser(follow)
    protected def getFirst = left.first ~ right.first
    override def toString: String = s"($left ~ $right)"
  }

  case class LASeqLeft[T, U](left: LAParser[T], right: LAParser[U]) extends LAParser[T] {
    lazy val parser = follow => left.parser(right.first ~ follow) <~ right.parser(follow)
    protected def getFirst = left.first ~ right.first
    override def toString: String = s"($left <~ $right)"
  }

  case class LAOr[T](left: LAParser[T], right: LAParser[T]) extends LAParser[T] {
    lazy val parser = follow => left.parser(follow) ||| right.parser(follow)
    protected def getFirst = left.first + right.first
    override def toString: String = s"$left |\n$right"
  }

  case class LAMap[T, U](laParser: LAParser[T], f: T => U) extends LAParser[U] {
    lazy val parser = follow => laParser.parser(follow) ^^ f
    protected def getFirst = laParser.first
    override def toString: String = s"($laParser ^^ <FUNC>)"
  }

  case class LAValue[T, U](laParser: LAParser[T], v: () => U) extends LAParser[U] {
    lazy val parser = follow => laParser.parser(follow) ^^^ v()
    protected def getFirst = laParser.first
    override def toString: String = s"($laParser ^^^ <VALUE>)"
  }

  case class LANotPred[T](laParser: LAParser[T]) extends LAParser[Unit] {
    lazy val parser = follow => not(laParser.parser(follow))
    protected def getFirst = emptyFirst
    override def toString: String = s"-$laParser"
  }

  case class LAAndPred[T](laParser: LAParser[T]) extends LAParser[T] {
    lazy val parser = follow => guard(laParser.parser(follow))
    protected def getFirst = emptyFirst
    override def toString: String = s"+$laParser"
  }

  private val pair = `~`
  case class LAMemoized[T](laParser: () => LAParser[T]) extends LAParser[T] {
    // XXX lazy val p = laParser()
    lazy val p = {
      val rule = laParser()
      var simples: List[LAParser[T]] = Nil
      var lrs: List[LAParser[T => T]] = Nil
      var alts: List[LAParser[T]] = flatten(rule)
      for (alt <- alts) alt match {
        case LAMap(p, f) => convertForLR(p) match {
          case Left(p) => simples ::= p ^^ f
          case Right(p) => lrs ::= p ^^ { g => (t: T) => f(g(t)) }
        }
        case _ =>
      }
      val simple = simples.reduce(_ | _)
      if (lrs.length == 0) rule else {
        lazy val lr: LAParser[List[T => T]] = memo(MATCH ^^^ Nil | lrs.reduce(_ | _) ~ lr ^^ { case f ~ l => f :: l })
        simple ~ lr ^^ { case t ~ fs => fs.foldLeft(t) { case (t, f) => f(t) } }
      }
    }
    lazy val parser = cached(follow => {
      memo(Parser { in => p.parser(follow)(in) })
    })
    protected def getFirst = p.first

    private def flatten(p: LAParser[T]): List[LAParser[T]] = p match {
      case LAOr(l, r) => flatten(l) ++ flatten(r)
      case _ => List(p)
    }

    private def convertForLR[A](p: LAParser[A]): Either[LAParser[A], LAParser[T => A]] = p match {
      case LASeq(LASeq(MATCH, l), r) if l eq this => Right(MATCH ~ r ^^ { case m ~ r => (t: T) => pair(pair(m, t), r) })
      case LASeqLeft(LASeq(MATCH, l), r) if l eq this => Right(MATCH <~ r ^^ { case m => (t: T) => pair(m, t) })

      case LASeq(l, r) => convertForLR(l) match {
        case Left(l) => Left(p)
        case Right(l) => Right(l ~ r ^^ { case f ~ r => (t: T) => pair(f(t), r) })
      }
      case LASeqLeft(l, r) => convertForLR(l) match {
        case Left(l) => Left(p)
        case Right(l) => Right(l <~ r)
      }
      case p => Left(p)
    }

    override def toString: String = "<TERM>"
  }

  // optional parsers
  def opt[T](p: => LAParser[T]): LAParser[Option[T]] = p ^^ { Some(_) } | MATCH ^^^ None

  // memoization of lookahead parsers
  def memo[T](p: => LAParser[T]): LAParser[T] = LAMemoized(() => p)

  // always match
  lazy val MATCH: LAParser[String] = log(new LAParser[String] {
    val parser = cached(follow => "" <~ +follow.parser)
    protected def getFirst = emptyFirst
    override def toString: String = "MATCH"
  })("MATCH")

  // always mismatch
  lazy val MISMATCH: LAParser[Nothing] = log(new LAParser[Nothing] {
    val parser = cached(follow => failed)
    protected def getFirst = noFirst
    override def toString: String = "MISMATCH"
  })("MISMATCH")

  // logging
  var keepLog: Boolean = true
  def log[T](p: LAParser[T])(name: String): LAParser[T] =
    if (!DEBUG_PARSER) p
    else new LAParser[T] {
      val parser = follow => Parser { rawIn =>
        val in = rawIn.asInstanceOf[EPackratReader[Char]]
        val stopMsg = s"trying $name with $follow at [${in.pos}] \n\n${in.pos.longString}\n"
        if (keepLog) stop(stopMsg) match {
          case "q" =>
            keepLog = false
            p(follow, in)
          case "j" =>
            keepLog = false
            val r = p(follow, in)
            printlnCyan(name + " --> " + r)
            keepLog = true
            r
          case _ =>
            val r = p(follow, in)
            printlnCyan(name + " --> " + r)
            r
        }
        else p(follow, in)
      }
      protected def getFirst = p.first
    }

  // stop message
  protected def stop(msg: String): String = {
    printlnCyan(msg)
    scala.io.StdIn.readLine
  }

  // Parse charater reader `in` with parser `p`
  def parse[T](p: LAParser[T], in: Reader[Char]): ParseResult[T] = {
    p(emptyFirst, new EPackratReader(in))
  }

  // Parse character sequence `in` with parser `p`
  def parse[T](p: LAParser[T], in: java.lang.CharSequence): ParseResult[T] =
    parse(p, new CharSequenceReader(in))

  // Parse reader `in` with parser `p`
  def parse[T](p: LAParser[T], in: java.io.Reader): ParseResult[T] =
    parse(p, new PagedSeqReader(PagedSeq.fromReader(in)))

  // record parsing process
  protected def record[T](parser: Parser[T], in: EPackratReader[Char]): ParseResult[T]

  // terminal lexer
  protected val TERMINAL: Lexer
}
