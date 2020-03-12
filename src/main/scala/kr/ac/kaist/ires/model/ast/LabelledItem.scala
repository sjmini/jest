package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LabelledItem extends AST {
  val kind: String = "LabelledItem"
}
case class LabelledItem0(x0: Statement, parserParams: List[Boolean]) extends LabelledItem {
  val name: String = "LabelledItem0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Statement", x0, Nil).reverse
  val info: ASTInfo = LabelledItem0
}
object LabelledItem0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "TopLevelVarScopedDeclarations0" -> LabelledItem0TopLevelVarScopedDeclarations0.func,
    "TopLevelVarDeclaredNames0" -> LabelledItem0TopLevelVarDeclaredNames0.func,
    "LexicallyDeclaredNames0" -> LabelledItem0LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> LabelledItem0LexicallyScopedDeclarations0.func,
    "LabelledEvaluation0" -> LabelledItem0LabelledEvaluation0.func
  )
}
case class LabelledItem1(x0: FunctionDeclaration, parserParams: List[Boolean]) extends LabelledItem {
  val name: String = "LabelledItem1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("FunctionDeclaration", x0, Nil).reverse
  val info: ASTInfo = LabelledItem1
}
object LabelledItem1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "VarDeclaredNames0" -> LabelledItem1VarDeclaredNames0.func,
    "StatementRules0" -> LabelledItem1StatementRules0.func,
    "ContainsUndefinedBreakTarget0" -> LabelledItem1ContainsUndefinedBreakTarget0.func,
    "ContainsUndefinedContinueTarget0" -> LabelledItem1ContainsUndefinedContinueTarget0.func,
    "LabelledEvaluation0" -> LabelledItem1LabelledEvaluation0.func,
    "ContainsDuplicateLabels0" -> LabelledItem1ContainsDuplicateLabels0.func,
    "LexicallyDeclaredNames0" -> LabelledItem1LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> LabelledItem1LexicallyScopedDeclarations0.func,
    "TopLevelVarDeclaredNames0" -> LabelledItem1TopLevelVarDeclaredNames0.func,
    "TopLevelVarScopedDeclarations0" -> LabelledItem1TopLevelVarScopedDeclarations0.func,
    "VarScopedDeclarations0" -> LabelledItem1VarScopedDeclarations0.func
  )
}
