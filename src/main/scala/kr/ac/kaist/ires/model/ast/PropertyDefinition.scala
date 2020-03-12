package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait PropertyDefinition extends AST {
  val kind: String = "PropertyDefinition"
}
case class PropertyDefinition0(x0: IdentifierReference, parserParams: List[Boolean]) extends PropertyDefinition {
  val name: String = "PropertyDefinition0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("IdentifierReference", x0, Nil).reverse
  val info: ASTInfo = PropertyDefinition0
}
object PropertyDefinition0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "PropName0" -> PropertyDefinition0PropName0.func,
    "PropertyDefinitionEvaluation0" -> PropertyDefinition0PropertyDefinitionEvaluation0.func
  )
}
case class PropertyDefinition1(x0: CoverInitializedName, parserParams: List[Boolean]) extends PropertyDefinition {
  val name: String = "PropertyDefinition1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("CoverInitializedName", x0, Nil).reverse
  val info: ASTInfo = PropertyDefinition1
}
object PropertyDefinition1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class PropertyDefinition2(x0: PropertyName, x2: AssignmentExpression, parserParams: List[Boolean]) extends PropertyDefinition {
  val name: String = "PropertyDefinition2"
  override def toString: String = {
    s"$x0 : $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("AssignmentExpression", x2, l("PropertyName", x0, Nil)).reverse
  val info: ASTInfo = PropertyDefinition2
}
object PropertyDefinition2 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "PropName0" -> PropertyDefinition2PropName0.func,
    "PropertyDefinitionEvaluation0" -> PropertyDefinition2PropertyDefinitionEvaluation0.func
  )
}
case class PropertyDefinition3(x0: MethodDefinition, parserParams: List[Boolean]) extends PropertyDefinition {
  val name: String = "PropertyDefinition3"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("MethodDefinition", x0, Nil).reverse
  val info: ASTInfo = PropertyDefinition3
}
object PropertyDefinition3 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Contains0" -> PropertyDefinition3Contains0.func
  )
}
case class PropertyDefinition4(x1: AssignmentExpression, parserParams: List[Boolean]) extends PropertyDefinition {
  val name: String = "PropertyDefinition4"
  override def toString: String = {
    s"... $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("AssignmentExpression", x1, Nil).reverse
  val info: ASTInfo = PropertyDefinition4
}
object PropertyDefinition4 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "PropertyDefinitionEvaluation0" -> PropertyDefinition4PropertyDefinitionEvaluation0.func,
    "PropName0" -> PropertyDefinition4PropName0.func
  )
}
