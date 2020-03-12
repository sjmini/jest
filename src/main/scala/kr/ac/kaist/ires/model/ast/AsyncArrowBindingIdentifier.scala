package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncArrowBindingIdentifier extends AST {
  val kind: String = "AsyncArrowBindingIdentifier"
}
case class AsyncArrowBindingIdentifier0(x0: BindingIdentifier, parserParams: List[Boolean]) extends AsyncArrowBindingIdentifier {
  val name: String = "AsyncArrowBindingIdentifier0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("BindingIdentifier", x0, Nil).reverse
  val info: ASTInfo = AsyncArrowBindingIdentifier0
}
object AsyncArrowBindingIdentifier0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "ExpectedArgumentCount0" -> AsyncArrowBindingIdentifier0ExpectedArgumentCount0.func,
    "IsSimpleParameterList0" -> AsyncArrowBindingIdentifier0IsSimpleParameterList0.func,
    "ContainsExpression0" -> AsyncArrowBindingIdentifier0ContainsExpression0.func,
    "IteratorBindingInitialization0" -> AsyncArrowBindingIdentifier0IteratorBindingInitialization0.func
  )
}
