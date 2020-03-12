package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TemplateSpans0SubstitutionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""TemplateSpans0SubstitutionEvaluation0""", List(Id("""this"""), Id("""TemplateTail""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List()))).setId(15629), IReturn(ERef(RefId(Id("""__x0__""")))).setId(15630))).setId(15635))
  val instToStepMap: Map[Int, Int] = Map(15629 -> 0, 15630 -> 0, 15631 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(15631, 15630, 15629))
  /* Beautified form:
  "TemplateSpans0SubstitutionEvaluation0" (this, TemplateTail) => {
    app __x0__ = (WrapCompletion (new []))
    return __x0__
  }
  */
}
