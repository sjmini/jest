package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait AsyncFunctionDeclaration extends AST {
  val kind: String = "AsyncFunctionDeclaration"
}
case class AsyncFunctionDeclaration0(x3: BindingIdentifier, x5: FormalParameters, x8: AsyncFunctionBody, parserParams: List[Boolean]) extends AsyncFunctionDeclaration {
  val name: String = "AsyncFunctionDeclaration0"
  override def toString: String = {
    s"async function $x3 ( $x5 ) { $x8 }"
  }
  val k: Int = d(x8, d(x5, d(x3, 0)))
  val fullList: List[(String, Value)] = l("AsyncFunctionBody", x8, l("FormalParameters", x5, l("BindingIdentifier", x3, Nil))).reverse
  val info: ASTInfo = AsyncFunctionDeclaration0
}
object AsyncFunctionDeclaration0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IsConstantDeclaration0" -> AsyncFunctionDeclaration0IsConstantDeclaration0.func,
    "BoundNames0" -> AsyncFunctionDeclaration0BoundNames0.func,
    "InstantiateFunctionObject0" -> AsyncFunctionDeclaration0InstantiateFunctionObject0.func,
    "Evaluation0" -> AsyncFunctionDeclaration0Evaluation0.func,
    "Contains0" -> AsyncFunctionDeclaration0Contains0.func
  )
}
case class AsyncFunctionDeclaration1(x4: FormalParameters, x7: AsyncFunctionBody, parserParams: List[Boolean]) extends AsyncFunctionDeclaration {
  val name: String = "AsyncFunctionDeclaration1"
  override def toString: String = {
    s"async function ( $x4 ) { $x7 }"
  }
  val k: Int = d(x7, d(x4, 0))
  val fullList: List[(String, Value)] = l("AsyncFunctionBody", x7, l("FormalParameters", x4, Nil)).reverse
  val info: ASTInfo = AsyncFunctionDeclaration1
}
object AsyncFunctionDeclaration1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> AsyncFunctionDeclaration1Evaluation0.func,
    "BoundNames0" -> AsyncFunctionDeclaration1BoundNames0.func,
    "InstantiateFunctionObject0" -> AsyncFunctionDeclaration1InstantiateFunctionObject0.func,
    "IsConstantDeclaration0" -> AsyncFunctionDeclaration1IsConstantDeclaration0.func,
    "Contains0" -> AsyncFunctionDeclaration1Contains0.func
  )
}
