package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait MemberExpression extends AST {
  val kind: String = "MemberExpression"
}
case class MemberExpression0(x0: PrimaryExpression, parserParams: List[Boolean]) extends MemberExpression {
  val name: String = "MemberExpression0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("PrimaryExpression", x0, Nil).reverse
  val info: ASTInfo = MemberExpression0
}
object MemberExpression0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsDestructuring0" -> MemberExpression0IsDestructuring0.func
  )
}
case class MemberExpression1(x0: MemberExpression, x2: Expression, parserParams: List[Boolean]) extends MemberExpression {
  val name: String = "MemberExpression1"
  override def toString: String = {
    s"$x0 [ $x2 ]"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("Expression", x2, l("MemberExpression", x0, Nil)).reverse
  val info: ASTInfo = MemberExpression1
}
object MemberExpression1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsIdentifierRef0" -> MemberExpression1IsIdentifierRef0.func,
    "IsFunctionDefinition0" -> MemberExpression1IsFunctionDefinition0.func,
    "IsDestructuring0" -> MemberExpression1IsDestructuring0.func,
    "AssignmentTargetType0" -> MemberExpression1AssignmentTargetType0.func,
    "Evaluation0" -> MemberExpression1Evaluation0.func,
    "ExpressionRules0" -> MemberExpression1ExpressionRules0.func
  )
}
case class MemberExpression2(x0: MemberExpression, x2: Lexical, parserParams: List[Boolean]) extends MemberExpression {
  val name: String = "MemberExpression2"
  override def toString: String = {
    s"$x0 . $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("Lexical", x2, l("MemberExpression", x0, Nil)).reverse
  val info: ASTInfo = MemberExpression2
}
object MemberExpression2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsIdentifierRef0" -> MemberExpression2IsIdentifierRef0.func,
    "Evaluation0" -> MemberExpression2Evaluation0.func,
    "IsDestructuring0" -> MemberExpression2IsDestructuring0.func,
    "ExpressionRules0" -> MemberExpression2ExpressionRules0.func,
    "AssignmentTargetType0" -> MemberExpression2AssignmentTargetType0.func,
    "IsFunctionDefinition0" -> MemberExpression2IsFunctionDefinition0.func,
    "Contains0" -> MemberExpression2Contains0.func
  )
}
case class MemberExpression3(x0: MemberExpression, x1: TemplateLiteral, parserParams: List[Boolean]) extends MemberExpression {
  val name: String = "MemberExpression3"
  override def toString: String = {
    s"$x0 $x1"
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("TemplateLiteral", x1, l("MemberExpression", x0, Nil)).reverse
  val info: ASTInfo = MemberExpression3
}
object MemberExpression3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsDestructuring0" -> MemberExpression3IsDestructuring0.func,
    "AssignmentTargetType0" -> MemberExpression3AssignmentTargetType0.func,
    "IsIdentifierRef0" -> MemberExpression3IsIdentifierRef0.func,
    "Evaluation0" -> MemberExpression3Evaluation0.func,
    "ExpressionRules0" -> MemberExpression3ExpressionRules0.func,
    "IsFunctionDefinition0" -> MemberExpression3IsFunctionDefinition0.func
  )
}
case class MemberExpression4(x0: SuperProperty, parserParams: List[Boolean]) extends MemberExpression {
  val name: String = "MemberExpression4"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("SuperProperty", x0, Nil).reverse
  val info: ASTInfo = MemberExpression4
}
object MemberExpression4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "AssignmentTargetType0" -> MemberExpression4AssignmentTargetType0.func,
    "IsDestructuring0" -> MemberExpression4IsDestructuring0.func,
    "IsFunctionDefinition0" -> MemberExpression4IsFunctionDefinition0.func,
    "ExpressionRules0" -> MemberExpression4ExpressionRules0.func,
    "IsIdentifierRef0" -> MemberExpression4IsIdentifierRef0.func
  )
}
case class MemberExpression5(x0: MetaProperty, parserParams: List[Boolean]) extends MemberExpression {
  val name: String = "MemberExpression5"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("MetaProperty", x0, Nil).reverse
  val info: ASTInfo = MemberExpression5
}
object MemberExpression5 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsFunctionDefinition0" -> MemberExpression5IsFunctionDefinition0.func,
    "IsDestructuring0" -> MemberExpression5IsDestructuring0.func,
    "IsIdentifierRef0" -> MemberExpression5IsIdentifierRef0.func,
    "ExpressionRules0" -> MemberExpression5ExpressionRules0.func
  )
}
case class MemberExpression6(x1: MemberExpression, x2: Arguments, parserParams: List[Boolean]) extends MemberExpression {
  val name: String = "MemberExpression6"
  override def toString: String = {
    s"new $x1 $x2"
  }
  val k: Int = d(x2, d(x1, 0))
  val fullList: List[(String, Value)] = l("Arguments", x2, l("MemberExpression", x1, Nil)).reverse
  val info: ASTInfo = MemberExpression6
}
object MemberExpression6 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsFunctionDefinition0" -> MemberExpression6IsFunctionDefinition0.func,
    "IsDestructuring0" -> MemberExpression6IsDestructuring0.func,
    "ExpressionRules0" -> MemberExpression6ExpressionRules0.func,
    "AssignmentTargetType0" -> MemberExpression6AssignmentTargetType0.func,
    "Evaluation0" -> MemberExpression6Evaluation0.func,
    "IsIdentifierRef0" -> MemberExpression6IsIdentifierRef0.func
  )
}
