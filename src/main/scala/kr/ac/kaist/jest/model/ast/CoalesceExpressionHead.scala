package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait CoalesceExpressionHead extends AST {
  val kind: String = "CoalesceExpressionHead"
}
case class CoalesceExpressionHead0(x0: CoalesceExpression, parserParams: List[Boolean]) extends CoalesceExpressionHead {
  x0.parent = Some(this)
  val name: String = "CoalesceExpressionHead0"
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
  val fullList: List[(String, Value)] = l("CoalesceExpression", x0, Nil).reverse
  val info: ASTInfo = CoalesceExpressionHead0
}
object CoalesceExpressionHead0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class CoalesceExpressionHead1(x0: BitwiseORExpression, parserParams: List[Boolean]) extends CoalesceExpressionHead {
  x0.parent = Some(this)
  val name: String = "CoalesceExpressionHead1"
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
  val fullList: List[(String, Value)] = l("BitwiseORExpression", x0, Nil).reverse
  val info: ASTInfo = CoalesceExpressionHead1
}
object CoalesceExpressionHead1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
