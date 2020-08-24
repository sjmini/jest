package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncConciseBody extends AST {
  val kind: String = "AsyncConciseBody"
}
case class AsyncConciseBody0(x1: ExpressionBody, parserParams: List[Boolean]) extends AsyncConciseBody {
  x1.parent = Some(this)
  val name: String = "AsyncConciseBody0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x1.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x1)
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("ExpressionBody", x1, Nil).reverse
  val info: ASTInfo = AsyncConciseBody0
}
object AsyncConciseBody0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class AsyncConciseBody1(x1: AsyncFunctionBody, parserParams: List[Boolean]) extends AsyncConciseBody {
  x1.parent = Some(this)
  val name: String = "AsyncConciseBody1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(end + 1)
    inc(x1.updateSpan(end))
    inc(end + 1)
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s("{", x1, "}")
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("AsyncFunctionBody", x1, Nil).reverse
  val info: ASTInfo = AsyncConciseBody1
}
object AsyncConciseBody1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
