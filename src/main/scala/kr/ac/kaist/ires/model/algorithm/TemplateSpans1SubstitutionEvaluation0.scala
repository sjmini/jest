package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TemplateSpans1SubstitutionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""TemplateSpans1SubstitutionEvaluation0""", List(Id("""this"""), Id("""TemplateMiddleList"""), Id("""TemplateTail""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateMiddleList"""))), EStr("""SubstitutionEvaluation""")).setId(15640), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(15641), IReturn(ERef(RefId(Id("""__x1__""")))).setId(15642))).setId(15648))
  val instToStepMap: Map[Int, Int] = Map(15640 -> 0, 15641 -> 0, 15642 -> 0, 15643 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(15643, 15642, 15641, 15640))
  /* Beautified form:
  "TemplateSpans1SubstitutionEvaluation0" (this, TemplateMiddleList, TemplateTail) => {
    access __x0__ = (TemplateMiddleList "SubstitutionEvaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
