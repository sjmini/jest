package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncArrowBindingIdentifier extends AST {
  val kind: String = "AsyncArrowBindingIdentifier"
}
case class AsyncArrowBindingIdentifier0(x0: BindingIdentifier, parserParams: List[Boolean]) extends AsyncArrowBindingIdentifier {
  x0.parent = Some(this)
  val name: String = "AsyncArrowBindingIdentifier0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("BindingIdentifier", x0, Nil).reverse
  val info: ASTInfo = AsyncArrowBindingIdentifier0
}
object AsyncArrowBindingIdentifier0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
