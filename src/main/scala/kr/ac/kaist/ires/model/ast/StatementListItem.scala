package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait StatementListItem extends AST {
  val kind: String = "StatementListItem"
}
case class StatementListItem0(x0: Statement, parserParams: List[Boolean]) extends StatementListItem {
  val name: String = "StatementListItem0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Statement", x0, Nil).reverse
  val info: ASTInfo = StatementListItem0
}
object StatementListItem0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "LexicallyDeclaredNames0" -> StatementListItem0LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> StatementListItem0LexicallyScopedDeclarations0.func,
    "TopLevelLexicallyDeclaredNames0" -> StatementListItem0TopLevelLexicallyDeclaredNames0.func,
    "TopLevelLexicallyScopedDeclarations0" -> StatementListItem0TopLevelLexicallyScopedDeclarations0.func,
    "TopLevelVarDeclaredNames0" -> StatementListItem0TopLevelVarDeclaredNames0.func,
    "TopLevelVarScopedDeclarations0" -> StatementListItem0TopLevelVarScopedDeclarations0.func
  )
}
case class StatementListItem1(x0: Declaration, parserParams: List[Boolean]) extends StatementListItem {
  val name: String = "StatementListItem1"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Declaration", x0, Nil).reverse
  val info: ASTInfo = StatementListItem1
}
object StatementListItem1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "LexicallyDeclaredNames0" -> StatementListItem1LexicallyDeclaredNames0.func,
    "TopLevelLexicallyDeclaredNames0" -> StatementListItem1TopLevelLexicallyDeclaredNames0.func,
    "StatementRules0" -> StatementListItem1StatementRules0.func,
    "TopLevelVarDeclaredNames0" -> StatementListItem1TopLevelVarDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> StatementListItem1LexicallyScopedDeclarations0.func,
    "ContainsUndefinedBreakTarget0" -> StatementListItem1ContainsUndefinedBreakTarget0.func,
    "ContainsUndefinedContinueTarget0" -> StatementListItem1ContainsUndefinedContinueTarget0.func,
    "VarDeclaredNames0" -> StatementListItem1VarDeclaredNames0.func,
    "TopLevelLexicallyScopedDeclarations0" -> StatementListItem1TopLevelLexicallyScopedDeclarations0.func,
    "VarScopedDeclarations0" -> StatementListItem1VarScopedDeclarations0.func,
    "ContainsDuplicateLabels0" -> StatementListItem1ContainsDuplicateLabels0.func,
    "TopLevelVarScopedDeclarations0" -> StatementListItem1TopLevelVarScopedDeclarations0.func
  )
}
