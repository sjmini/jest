package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait LabelledItem extends AST {
  val kind: String = "LabelledItem"
}
case class LabelledItem0(x0: Statement, parserParams: List[Boolean]) extends LabelledItem {
  x0.parent = Some(this)
  val name: String = "LabelledItem0"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Statement", x0, Nil).reverse
  val info: ASTInfo = LabelledItem0
}
object LabelledItem0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "LabelledEvaluation0" -> LabelledItem0LabelledEvaluation0.func,
    "LexicallyScopedDeclarations0" -> LabelledItem0LexicallyScopedDeclarations0.func,
    "TopLevelVarDeclaredNames0" -> LabelledItem0TopLevelVarDeclaredNames0.func,
    "TopLevelVarScopedDeclarations0" -> LabelledItem0TopLevelVarScopedDeclarations0.func
  )
}
case class LabelledItem1(x0: FunctionDeclaration, parserParams: List[Boolean]) extends LabelledItem {
  x0.parent = Some(this)
  val name: String = "LabelledItem1"
  def updateSpan(newStart: Int): Int = {
    start = newStart
    end = start
    inc(x0.updateSpan(end))
    if (end > start) end -= 1
    end
  }
  override def toString: String = {
    s(x0)
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("FunctionDeclaration", x0, Nil).reverse
  val info: ASTInfo = LabelledItem1
}
object LabelledItem1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}
