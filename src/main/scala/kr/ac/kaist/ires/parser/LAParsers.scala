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
  trait LAParser[+T] { self =>
    val parser: FirstTerms => Parser[T]
    protected def getFirst: FirstTerms

    private var visited = false
    private var firstCache: FirstTerms = noFirst
    def first: FirstTerms = {
      if (!visited) { visited = true; firstCache = getFirst }
      firstCache
    }

    def ~[U](that: => LAParser[U]): LAParser[T ~ U] = new LAParser[T ~ U] {
      val parser = follow => self.parser(that.first ~ follow) ~ that.parser(follow)
      protected def getFirst = self.first ~ that.first
    }

    def ~>[U](that: => LAParser[U]): LAParser[U] = new LAParser[U] {
      val parser = follow => self.parser(that.first ~ follow) ~> that.parser(follow)
      protected def getFirst = self.first ~ that.first
    }

    def <~[U](that: => LAParser[U]): LAParser[T] = new LAParser[T] {
      val parser = follow => self.parser(that.first ~ follow) <~ that.parser(follow)
      protected def getFirst = self.first ~ that.first
    }

    def |[U >: T](that: LAParser[U]): LAParser[U] =
      if (that eq MISMATCH) self
      else new LAParser[U] {
        val parser = follow => self.parser(follow) ||| that.parser(follow)
        protected def getFirst = self.first + that.first
      }

    def ^^[U](f: T => U): LAParser[U] = new LAParser[U] {
      val parser = follow => self.parser(follow) ^^ f
      protected def getFirst = self.first
    }

    def ^^^[U](v: => U): LAParser[U] = new LAParser[U] {
      val parser = follow => self.parser(follow) ^^^ v
      protected def getFirst = self.first
    }

    def apply(follow: FirstTerms, in: EPackratReader[Char]): ParseResult[T] =
      parse(parser(follow), in)

    def unary_-(): LAParser[Unit] = new LAParser[Unit] {
      val parser = follow => not(self.parser(follow))
      protected def getFirst = emptyFirst
    }

    def unary_+(): LAParser[T] = new LAParser[T] {
      val parser = follow => guard(self.parser(follow))
      protected def getFirst = emptyFirst
    }
  }

  // always match
  lazy val MATCH: LAParser[String] = log(new LAParser[String] {
    val parser = cached(follow => "" <~ +follow.parser)
    protected def getFirst = emptyFirst
  })("MATCH")

  // always mismatch
  lazy val MISMATCH: LAParser[Nothing] = log(new LAParser[Nothing] {
    val parser = cached(follow => failed)
    protected def getFirst = noFirst
  })("MISMATCH")

  // optional parsers
  def opt[T](p: => LAParser[T]): LAParser[Option[T]] = p ^^ { Some(_) } | MATCH ^^^ None

  // memoization of lookahead parsers
  def memo[T](p: => LAParser[T]): LAParser[T] = new LAParser[T] {
    val parser = cached(follow => {
      lazy val q = p
      memo(Parser { in => q.parser(follow)(in) })
    })
    protected def getFirst = p.first
  }

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
