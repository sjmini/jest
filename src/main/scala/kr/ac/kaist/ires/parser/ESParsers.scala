package kr.ac.kaist.ires.parser

import kr.ac.kaist.ires.error.{ WrongNumberOfParserParams, TooManySemicolonInsertion }
import kr.ac.kaist.ires.model.{ Script }
import kr.ac.kaist.ires.util.Useful._
import kr.ac.kaist.ires.{ AST, Lexical, DEBUG_PARSER, DEBUG_SEMI_INSERT, LINE_SEP }
import scala.collection.mutable
import scala.util.matching.Regex
import scala.util.parsing.combinator._
import scala.util.parsing.input._

trait ESParsers extends LAParsers {
  // automatic semicolon insertion
  def insertSemicolon(reader: EPackratReader[Char]): Option[String] = {
    reader.box.rightmostFailedPos match {
      case Some(pos) =>
        val source = reader.source.toString
        val line = pos.line - 1
        val column = pos.column - 1
        val lines = source.replace("\r\n", "\n").split(Array('\n', '\r'))
        val revStr = {
          val (preLines, postLines) = lines.splitAt(line)
          preLines.foldLeft("") { case (s, l) => s + l + "\n" } +
            (if (postLines.length > 0) postLines(0).substring(0, column) else "")
        }.reverse

        if (DEBUG_SEMI_INSERT) {
          lines.zipWithIndex.foreach {
            case (x, i) => println(f"$i%4d: $x")
          }
          stop(s"line: $line, column: $column")
        }

        lazy val curLine = lines(line)
        lazy val curChar = curLine.charAt(column)

        // insert semicolon right before the offending token
        lazy val insert = Some({
          if (line < lines.length) {
            val (pre, post) = curLine.splitAt(column)
            lines(line) = pre + ';' + post
          } else lines(lines.length - 1) = lines(lines.length - 1) + ';'
          lines.mkString("\n")
        })

        // 2. The end of the input stream of tokens is encountered
        if (line >= lines.length ||
          (line == lines.length - 1 && column == curLine.length)) return insert

        // A. Additional Rules
        // A semicolon is never inserted automatically if the semicolon
        // would then be parsed as an empty statement or if that semicolon
        // would become one of the two semicolons in the header of a for statement
        // TODO
        if (curChar == ';') return None

        // 1-1. The offending token is separated from the previous token
        //      by at least one LineTerminator
        if (!parse(strNoLineTerminator, revStr).successful) return insert

        // 1-2. The offending token is '}'
        if (curChar == '}') return insert

        // 1-3. The previous token is ')' and the inserted semicolon would then be
        //      parsed as the terminating semicolon of a do-while statement (13.7.2).
        // TODO

        // 3. the restricted token is separated from the previous token
        //    by at least one LineTerminator, then a semicolon is automatically
        //    inserted before the restricted token.
        // TODO

        None
      case None => None
    }
  }

  // terminal parsers
  val t = cached[String, LAParser[String]] {
    case t => log(new LAParser[String] {
      val parser = cached(follow => {
        Skip ~> {
          if (t.matches("[a-z]+")) t <~ not(IDContinue)
          else t
        } <~ +follow.parser
      })
      protected def getFirst = noFirst + t
    })(t)
  }
  val nt = cached[(String, Lexer), LAParser[Lexical]] {
    case (name, nt) => log(new LAParser[Lexical] {
      val parser = cached(follow => (Skip ~> nt <~ +follow.parser) ^^ { Lexical(name, _) })
      protected def getFirst = noFirst + (name -> nt)
    })(name)
  }
  val ntl = cached[Parser[String], LAParser[Lexical]] {
    case nt => log(new LAParser[Lexical] {
      val parser = cached(follow => (Skip ~> nt) ^^ { Lexical("", _) })
      protected def getFirst = noFirst
    })("")
  }

  // parser that supports automatic semicolon insertions
  override def parse[T](p: LAParser[T], in: Reader[Char]): ParseResult[T] = {
    val MAX_ADDITION = 100
    val init: Either[ParseResult[T], Reader[Char]] = Right(in)
    (0 until MAX_ADDITION).foldLeft(init) {
      case (Right(in), _) =>
        val reader = new EPackratReader(in)
        p(emptyFirst, reader) match {
          case (f: Failure) => insertSemicolon(reader) match {
            case Some(str) => Right(new CharSequenceReader(str))
            case None => Left(f)
          }
          case r => Left(r)
        }
      case (res, _) => res
    } match {
      case Left(res) => res
      case _ => throw TooManySemicolonInsertion(MAX_ADDITION)
    }
  }

  // ECMAScript parsers
  type ESParser[+T] = List[Boolean] => LAParser[T]

  // memoization of parametric rules
  def memo[T](f: ESParser[T]): ESParser[T] = cached(args => memo(f(args)))

  // resolve left recursions
  type FLAParser[T] = LAParser[T => T]
  def resolveLL[T](f: LAParser[T], s: FLAParser[T]): LAParser[T] = {
    lazy val p: FLAParser[T] = s ~ p ^^ { case b ~ f => (x: T) => f(b(x)) } | MATCH ^^^ { (x: T) => x }
    f ~ p ^^ { case a ~ f => f(a) }
  }

  // record right-most faield positions
  protected def record[T](parser: Parser[T], in: EPackratReader[Char]): ParseResult[T] = {
    val box = in.box
    val res = parser(in)
    (res, box.rightmostFailedPos) match {
      case (f @ Failure(_, cur: EPackratReader[_]), origPos) if origPos.fold(true)(_ < cur.pos) =>
        box.rightmostFailedPos = Some(cur.pos)
      case _ =>
    }
    res
  }

  // script parsers
  val Script: ESParser[Script]

  // no LineTerminator parser
  lazy val NoLineTerminator: LAParser[String] = log(new LAParser[String] {
    val parser = follow => strNoLineTerminator
    protected def getFirst = emptyFirst
  })("NoLineTerminator")

  // all rules
  val rules: Map[String, ESParser[AST]]

  // get fixed length arguments
  def getArgsN(name: String, args: List[Boolean], n: Int): List[Boolean] = {
    if (args.length == n) args
    else throw WrongNumberOfParserParams(name, args)
  }
}
