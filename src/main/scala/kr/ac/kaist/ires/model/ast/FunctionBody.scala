package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait FunctionBody extends AST {
  val kind: String = "FunctionBody"
}
case class FunctionBody0(x0: FunctionStatementList, parserParams: List[Boolean]) extends FunctionBody {
  val name: String = "FunctionBody0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("FunctionStatementList", x0, Nil).reverse
  val info: ASTInfo = FunctionBody0
}
object FunctionBody0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "EvaluateBody0" -> FunctionBody0EvaluateBody0.func,
    "ContainsUseStrict0" -> FunctionBody0ContainsUseStrict0.func
  )
}
