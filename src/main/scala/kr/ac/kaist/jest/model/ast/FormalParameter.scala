package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait FormalParameter extends AST {
  val kind: String = "FormalParameter"
}
case class FormalParameter0(x0: BindingElement, parserParams: List[Boolean]) extends FormalParameter {
  x0.parent = Some(this)
  val name: String = "FormalParameter0"
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
  val fullList: List[(String, Value)] = l("BindingElement", x0, Nil).reverse
  val info: ASTInfo = FormalParameter0
}
object FormalParameter0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsSimpleParameterList0" -> FormalParameter0IsSimpleParameterList0.func,
    "IteratorBindingInitialization0" -> FormalParameter0IteratorBindingInitialization0.func
  )
}
