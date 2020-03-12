package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait Script extends AST {
  val kind: String = "Script"
}
case class Script0(x0: Option[ScriptBody], parserParams: List[Boolean]) extends Script {
  val name: String = "Script0"
  override def toString: String = {
    s"${x0.getOrElse("")}"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Option[ScriptBody]", x0, Nil).reverse
  val info: ASTInfo = Script0
}
object Script0 extends ASTInfo {
  val maxK: Int = 1
  val semMap: Map[String, Func] = Map(
    "VarScopedDeclarations0" -> Script0VarScopedDeclarations0.func,
    "LexicallyDeclaredNames0" -> Script0LexicallyDeclaredNames0.func,
    "LexicallyScopedDeclarations0" -> Script0LexicallyScopedDeclarations0.func,
    "VarDeclaredNames0" -> Script0VarDeclaredNames0.func,
    "Evaluation0" -> Script0Evaluation0.func
  )
}
