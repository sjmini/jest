package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BitwiseORExpression extends AST {
  val kind: String = "BitwiseORExpression"
}
case class BitwiseORExpression0(x0: BitwiseXORExpression, parserParams: List[Boolean]) extends BitwiseORExpression {
  val name: String = "BitwiseORExpression0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("BitwiseXORExpression", x0, Nil).reverse
  val info: ASTInfo = BitwiseORExpression0
}
object BitwiseORExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class BitwiseORExpression1(x0: BitwiseORExpression, x2: BitwiseXORExpression, parserParams: List[Boolean]) extends BitwiseORExpression {
  val name: String = "BitwiseORExpression1"
  override def toString: String = {
    s"$x0 | $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("BitwiseXORExpression", x2, l("BitwiseORExpression", x0, Nil)).reverse
  val info: ASTInfo = BitwiseORExpression1
}
object BitwiseORExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> BitwiseORExpression1Evaluation0.func,
    "IsFunctionDefinition0" -> BitwiseORExpression1IsFunctionDefinition0.func,
    "ExpressionRules0" -> BitwiseORExpression1ExpressionRules0.func,
    "AssignmentTargetType0" -> BitwiseORExpression1AssignmentTargetType0.func
  )
}
