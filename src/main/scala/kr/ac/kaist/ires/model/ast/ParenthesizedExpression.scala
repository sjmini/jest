package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ParenthesizedExpression extends AST {
  val kind: String = "ParenthesizedExpression"
}
case class ParenthesizedExpression0(x1: Expression, parserParams: List[Boolean]) extends ParenthesizedExpression {
  x1.parent = Some(this)
  val name: String = "ParenthesizedExpression0"
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
    s("(", x1, ")")
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("Expression", x1, Nil).reverse
  val info: ASTInfo = ParenthesizedExpression0
}
object ParenthesizedExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> ParenthesizedExpression0Evaluation0.func,
    "IsFunctionDefinition0" -> ParenthesizedExpression0IsFunctionDefinition0.func,
    "NamedEvaluation0" -> ParenthesizedExpression0NamedEvaluation0.func
  )
}
