package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait BindingList extends AST {
  val kind: String = "BindingList"
}
case class BindingList0(x0: LexicalBinding, parserParams: List[Boolean]) extends BindingList {
  val name: String = "BindingList0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("LexicalBinding", x0, Nil).reverse
  val info: ASTInfo = BindingList0
}
object BindingList0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
case class BindingList1(x0: BindingList, x2: LexicalBinding, parserParams: List[Boolean]) extends BindingList {
  val name: String = "BindingList1"
  override def toString: String = {
    s"$x0 , $x2"
  }
  val k: Int = d(x2, d(x0, 0))
  val fullList: List[(String, Value)] = l("LexicalBinding", x2, l("BindingList", x0, Nil)).reverse
  val info: ASTInfo = BindingList1
}
object BindingList1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> BindingList1Evaluation0.func,
    "BoundNames0" -> BindingList1BoundNames0.func
  )
}
