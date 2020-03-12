package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait TemplateSpans extends AST {
  val kind: String = "TemplateSpans"
}
case class TemplateSpans0(x0: Lexical, parserParams: List[Boolean]) extends TemplateSpans {
  val name: String = "TemplateSpans0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("Lexical", x0, Nil).reverse
  val info: ASTInfo = TemplateSpans0
}
object TemplateSpans0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> TemplateSpans0Evaluation0.func,
    "TemplateStrings0" -> TemplateSpans0TemplateStrings0.func,
    "SubstitutionEvaluation0" -> TemplateSpans0SubstitutionEvaluation0.func
  )
}
case class TemplateSpans1(x0: TemplateMiddleList, x1: Lexical, parserParams: List[Boolean]) extends TemplateSpans {
  val name: String = "TemplateSpans1"
  override def toString: String = {
    s"$x0 $x1"
  }
  val k: Int = d(x1, d(x0, 0))
  val fullList: List[(String, Value)] = l("Lexical", x1, l("TemplateMiddleList", x0, Nil)).reverse
  val info: ASTInfo = TemplateSpans1
}
object TemplateSpans1 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map(
    "Evaluation0" -> TemplateSpans1Evaluation0.func,
    "SubstitutionEvaluation0" -> TemplateSpans1SubstitutionEvaluation0.func,
    "TemplateStrings0" -> TemplateSpans1TemplateStrings0.func
  )
}
