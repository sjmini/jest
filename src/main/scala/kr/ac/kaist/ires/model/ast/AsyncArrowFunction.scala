package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncArrowFunction extends AST {
  val kind: String = "AsyncArrowFunction"
}
case class AsyncArrowFunction0(x2: AsyncArrowBindingIdentifier, x5: AsyncConciseBody, parserParams: List[Boolean]) extends AsyncArrowFunction {
  x2.parent = Some(this)
  x5.parent = Some(this)
  val name: String = "AsyncArrowFunction0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 5)
    inc(x2.updateSpan(end))
    inc(end + 2)
    inc(x5.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("async", x2, "=>", x5)
  }
  val k: Int = d(x5, d(x2, 0))
  val fullList: List[(String, Value)] = l("AsyncConciseBody", x5, l("AsyncArrowBindingIdentifier", x2, Nil)).reverse
  val info: ASTInfo = AsyncArrowFunction0
}
object AsyncArrowFunction0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class AsyncArrowFunction1(x0: CoverCallExpressionAndAsyncArrowHead, x3: AsyncConciseBody, parserParams: List[Boolean]) extends AsyncArrowFunction {
  x0.parent = Some(this)
  x3.parent = Some(this)
  val name: String = "AsyncArrowFunction1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    inc(end + 2)
    inc(x3.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0, "=>", x3)
  }
  val k: Int = d(x3, d(x0, 0))
  val fullList: List[(String, Value)] = l("AsyncConciseBody", x3, l("CoverCallExpressionAndAsyncArrowHead", x0, Nil)).reverse
  val info: ASTInfo = AsyncArrowFunction1
}
object AsyncArrowFunction1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
