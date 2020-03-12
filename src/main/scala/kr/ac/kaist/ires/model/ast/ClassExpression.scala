package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ClassExpression extends AST {
  val kind: String = "ClassExpression"
}
case class ClassExpression0(x1: Option[BindingIdentifier], x2: ClassTail, parserParams: List[Boolean]) extends ClassExpression {
  val name: String = "ClassExpression0"
  override def toString: String = {
    s"class ${x1.getOrElse("")} $x2"
  }
  val k: Int = d(x2, d(x1, 0))
  val fullList: List[(String, Value)] = l("ClassTail", x2, l("Option[BindingIdentifier]", x1, Nil)).reverse
  val info: ASTInfo = ClassExpression0
}
object ClassExpression0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "HasName0" -> ClassExpression0HasName0.func,
    "HasName1" -> ClassExpression0HasName1.func,
    "Evaluation1" -> ClassExpression0Evaluation1.func,
    "IsFunctionDefinition1" -> ClassExpression0IsFunctionDefinition1.func,
    "NamedEvaluation0" -> ClassExpression0NamedEvaluation0.func
  )
}
