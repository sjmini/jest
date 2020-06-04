package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateSpans1SubstitutionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""TemplateSpans1SubstitutionEvaluation0""", List(Id("""this"""), Id("""TemplateMiddleList"""), Id("""TemplateTail""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateMiddleList"""))), EStr("""SubstitutionEvaluation""")).setId(15640), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(15641), IReturn(ERef(RefId(Id("""__x1__""")))).setId(15642))).setId(-1))
  /* Beautified form:
  "TemplateSpans1SubstitutionEvaluation0" (this, TemplateMiddleList, TemplateTail) => {
    access __x0__ = (TemplateMiddleList "SubstitutionEvaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
