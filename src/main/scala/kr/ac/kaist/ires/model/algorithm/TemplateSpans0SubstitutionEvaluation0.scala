package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateSpans0SubstitutionEvaluation0 extends Algorithm {
  val name: String = "TemplateSpans0SubstitutionEvaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""TemplateSpans0SubstitutionEvaluation0" (this, TemplateTail) => {
    app __x0__ = (WrapCompletion (new []))
    return __x0__
  }"""), this)
}
