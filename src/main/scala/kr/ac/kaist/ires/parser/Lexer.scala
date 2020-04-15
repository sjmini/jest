package kr.ac.kaist.ires.parser

import kr.ac.kaist.ires.util.Useful.cached
import scala.util.matching.Regex
import scala.util.parsing.combinator.RegexParsers
import scala.util.parsing.input._

trait Lexer extends RegexParsers with EPackratParsers with UnicodeRegex {
  // not skip white spaces
  override def skipWhitespace = false

  // lexer type
  type Lexer = EPackratParser[String]

  // implicit lexer helper
  implicit class LexerHelper[T](val parser: T)(implicit f: T => Parser[String]) {
    // lookahead symbols
    def unary_-(): Parser[String] = "" <~ not(parser)
    def unary_+(): Parser[String] = "" <~ guard(parser)

    // sequence
    def %(that: => Parser[String]): Parser[String] =
      this.parser ~ that.parser ^^ { case x ~ y => x + y }

    // sequence with Skip
    def %%(that: => Parser[String]): Parser[String] = %(
      if (that.parser eq strNoLineTerminator) that.parser
      else Skip ~> that.parser
    )

    // exclusion (butnot) symbol
    def \(cond: Lexer): Lexer = exclusionCache((parser, cond))

    // optional symbol
    def opt(): Parser[String] = parser | ""
  }
  private val exclusionCache =
    cached[(Parser[String], Parser[String]), Lexer]({
      case (l, r) => l.filter(s => parseAll(r.parser, new EPackratReader(new CharSequenceReader(s))).isEmpty)
    })

  // basic lexers
  lazy val WhiteSpace: Lexer = TAB | VT | FF | SP | NBSP | ZWNBSP | USP
  lazy val LineTerminator: Lexer = LF | CR | LS | PS
  lazy val LineTerminatorSequence: Lexer = LF | CR <~ -LF | LS | PS | CR % LF

  // skip
  lazy val Skip: Lexer =
    ((WhiteSpace | LineTerminator | Comment)*) ^^ { _.mkString }

  // no LineTerminator lexer
  lazy val strNoLineTerminator: Lexer =
    +Skip.filter(s => lines.findFirstIn(s).isEmpty)

  // Parse charater reader `in` with parser `p`
  def parse(p: Lexer, in: Reader[Char]): ParseResult[String] = {
    p(new EPackratReader(in))
  }

  // Parse character sequence `in` with parser `p`
  def parse(p: Lexer, in: java.lang.CharSequence): ParseResult[String] =
    parse(p, new CharSequenceReader(in))

  // Parse reader `in` with parser `p`
  def parse(p: Lexer, in: java.io.Reader): ParseResult[String] =
    parse(p, new PagedSeqReader(PagedSeq.fromReader(in)))
}
