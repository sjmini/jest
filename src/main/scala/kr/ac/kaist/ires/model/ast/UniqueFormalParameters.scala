package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait UniqueFormalParameters extends AST {
  val kind: String = "UniqueFormalParameters"
}
case class UniqueFormalParameters0(x0: FormalParameters, parserParams: List[Boolean]) extends UniqueFormalParameters {
  val name: String = "UniqueFormalParameters0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("FormalParameters", x0, Nil).reverse
  val info: ASTInfo = UniqueFormalParameters0
}
object UniqueFormalParameters0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}