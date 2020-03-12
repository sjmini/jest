package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BindingRestElement extends AST {
  val kind: String = "BindingRestElement"
}
case class BindingRestElement0(x1: BindingIdentifier, parserParams: List[Boolean]) extends BindingRestElement {
  val name: String = "BindingRestElement0"
  override def toString: String = {
    s"... $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("BindingIdentifier", x1, Nil).reverse
  val info: ASTInfo = BindingRestElement0
}
object BindingRestElement0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IteratorBindingInitialization0" -> BindingRestElement0IteratorBindingInitialization0.func,
    "ContainsExpression0" -> BindingRestElement0ContainsExpression0.func
  )
}
case class BindingRestElement1(x1: BindingPattern, parserParams: List[Boolean]) extends BindingRestElement {
  val name: String = "BindingRestElement1"
  override def toString: String = {
    s"... $x1"
  }
  val k: Int = d(x1, 0)
  val fullList: List[(String, Value)] = l("BindingPattern", x1, Nil).reverse
  val info: ASTInfo = BindingRestElement1
}
object BindingRestElement1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "IteratorBindingInitialization0" -> BindingRestElement1IteratorBindingInitialization0.func,
    "ContainsExpression0" -> BindingRestElement1ContainsExpression0.func
  )
}
