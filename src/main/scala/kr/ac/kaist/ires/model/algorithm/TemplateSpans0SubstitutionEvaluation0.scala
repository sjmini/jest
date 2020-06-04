package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateSpans0SubstitutionEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""TemplateSpans0SubstitutionEvaluation0""", List(Id("""this"""), Id("""TemplateTail""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List()))).setId(15629), IReturn(ERef(RefId(Id("""__x0__""")))).setId(15630))).setId(-1))
  /* Beautified form:
  "TemplateSpans0SubstitutionEvaluation0" (this, TemplateTail) => {
    app __x0__ = (WrapCompletion (new []))
    return __x0__
  }
  */
}
