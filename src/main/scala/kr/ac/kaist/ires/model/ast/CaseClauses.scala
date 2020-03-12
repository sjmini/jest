package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait CaseClauses extends AST {
  val kind: String = "CaseClauses"
}
case class CaseClauses0(x0: CaseClause, parserParams: List[Boolean]) extends CaseClauses {
  val name: String = "CaseClauses0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("CaseClause", x0, Nil).reverse
  val info: ASTInfo = CaseClauses0
}
object CaseClauses0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class CaseClauses1(x0: CaseClauses, x1: CaseClause, parserParams: List[Boolean]) extends CaseClauses {
  val name: String = "CaseClauses1"
  override def toString: String = {
    s"$x0 $x1"
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("CaseClause", x1, l("CaseClauses", x0, Nil)).reverse
  val info: ASTInfo = CaseClauses1
}
object CaseClauses1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ContainsUndefinedBreakTarget0" -> CaseClauses1ContainsUndefinedBreakTarget0.func,
    "LexicallyScopedDeclarations0" -> CaseClauses1LexicallyScopedDeclarations0.func,
    "LexicallyDeclaredNames0" -> CaseClauses1LexicallyDeclaredNames0.func,
    "StatementRules0" -> CaseClauses1StatementRules0.func,
    "ContainsDuplicateLabels0" -> CaseClauses1ContainsDuplicateLabels0.func,
    "ContainsUndefinedContinueTarget0" -> CaseClauses1ContainsUndefinedContinueTarget0.func,
    "VarScopedDeclarations0" -> CaseClauses1VarScopedDeclarations0.func,
    "VarDeclaredNames0" -> CaseClauses1VarDeclaredNames0.func
  )
}
