package kr.ac.kaist.ires.parser

import scala.collection.mutable
import scala.util.parsing.combinator.Parsers
import scala.util.parsing.input.{ Reader, Position }
import scala.language.implicitConversions

trait EPackratParsers extends Parsers {
  var TOTAL = 0
  var SUCCESS = 0
  var FAILURE = 0

  case class Box(
      var rightmostFailedPos: Option[Position],
      private[EPackratParsers] var wrapper: Option[Work]
  )
  case class Work(p: Parser[_], pos: Position) {
    override def toString: String = f"(0x${p.hashCode}%x, $pos)"
  }
  class WorkList[T] {
    private val stack = mutable.Stack[T]()
    private val set = mutable.Set[T]()
    def isEmpty = set.isEmpty
    def put(elem: T): Unit = if (!(set contains elem)) { set += elem; stack += elem }
    def getNext: T = { val elem = stack.pop; set -= elem; elem }
    override def toString: String = stack.mkString("[", ", ", "]")
  }

  case class EPackratReader[+T <: Elem](
      underlying: Reader[T],
      box: Box = Box(None, None),
      private[EPackratParsers] val cache: mutable.Map[Work, ParseResult[_]] = mutable.HashMap.empty,
      private[EPackratParsers] val at: mutable.Map[Position, EPackratReader[Elem]] = mutable.HashMap.empty,
      private[EPackratParsers] val depGraph: mutable.Map[Work, Set[Work]] = mutable.HashMap.empty
  ) extends Reader[T] {
    override def source: java.lang.CharSequence = underlying.source
    override def offset: Int = underlying.offset
    override def toString: String = underlying.toString
    def first: T = underlying.first
    def rest: Reader[T] = copy(
      underlying = underlying.rest,
    )
    def pos: Position = underlying.pos
    def atEnd: Boolean = underlying.atEnd
  }

  abstract class EPackratParser[+T] extends super.Parser[T]

  val EMPTY = Parser[String] { in => Success("", in) }

  implicit def parser2packrat[T, P](p: => P)(implicit f: P => Parser[T]): EPackratParser[T] = {
    lazy val q = p
    memo(Parser { in => q(in) })
  }

  private def display(any: Any): Unit = {} // println(any)

  private def simple[T](r: ParseResult[T]): String = (r match {
    case (no: NoSuccess) => no.msg
    case _ => r
  }).toString

  def memo[T](p: super.Parser[T]): EPackratParser[T] = new EPackratParser[T] {
    def apply(in: Input) = {
      val inMem = in.asInstanceOf[EPackratReader[Elem]]
      val cache = inMem.cache
      val depGraph = inMem.depGraph
      val box = inMem.box
      val at = inMem.at
      val pos = inMem.pos
      val work = Work(p, pos)
      at.put(pos, inMem)
      display(s"--------------------------------------------------")
      display(s"memo $work:")

      // add an dependency edge to the wrapper work
      box.wrapper.map(to => {
        display(s"  - ADD-DEPENDENCY: $work -> $to")
        val set = depGraph.getOrElse(work, Set())
        depGraph += work -> (set + to)
      })

      cache.get(work) match {
        case None =>
          // caching the current work is fail
          display(s"  - DUMMY-CACHED")
          cache.put(work, Failure("LR", inMem))

          // run parser
          val originWrapper = box.wrapper
          box.wrapper = Some(work)
          val res = p(inMem)
          box.wrapper = originWrapper
          display(s"  - res: ${simple(res)}")

          res match {
            case (succ: Success[_]) =>
              cache.put(work, succ)

              inc(p, inMem)

              val worklist = new WorkList[Work]
              val deps = depGraph.getOrElse(work, Nil)
              display(s"- WORKLIST <- $deps)")
              deps.foreach(worklist.put _)

              worklist.put(work)
              while (!worklist.isEmpty) {
                val work @ Work(p, pos) = worklist.getNext
                display(s"$work <- $worklist")
                val oldRes = cache(work)
                box.wrapper = None
                val inMem = at(pos)
                val newRes = inc(p, inMem)
                display(s"- oldRes: $oldRes")
                display(s"- newRes: ${simple(newRes)}")

                if (lessThen(oldRes, newRes)) {
                  val deps = depGraph.getOrElse(work, Nil)
                  display(s"- WORKLIST <- $deps)")
                  deps.foreach(worklist.put _)
                }
              }
              box.wrapper = originWrapper
              cache(work).asInstanceOf[ParseResult[T]]
            case fail => fail
          }
        case Some(res) =>
          display(s"  - CACHE-EXIST: $res")
          res.asInstanceOf[ParseResult[T]]
      }
    }
  }

  private def lessThen(l: ParseResult[_], r: ParseResult[_]): Boolean =
    (!l.successful && r.successful) || (l.next.pos < r.next.pos)
  private def inc[T](
    p: super.Parser[T],
    inMem: EPackratReader[Elem]
  ): ParseResult[T] = {
    val cache = inMem.cache
    val depGraph = inMem.depGraph
    val box = inMem.box
    val at = inMem.at
    val pos = inMem.pos

    val work = Work(p, pos)
    val oldRes = cache(work).asInstanceOf[ParseResult[T]]
    val newRes = p(inMem)

    TOTAL += 1
    if (lessThen(oldRes, newRes)) {
      SUCCESS += 1
      cache.put(work, newRes)
      inc(p, inMem)
    } else {
      FAILURE += 1
      oldRes
    }
  }
}
