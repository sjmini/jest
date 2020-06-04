package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateSpans0TemplateStrings0 {
  val length: Int = 0
  val func: Func = Func("""TemplateSpans0TemplateStrings0""", List(Id("""this"""), Id("""TemplateTail"""), Id("""raw""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""raw"""))), EBool(false)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateTail"""))), EStr("""TV""")).setId(15186), ILet(Id("""tail"""), ERef(RefId(Id("""__x0__""")))).setId(15187))).setId(15189), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""TemplateTail"""))), EStr("""TRV""")).setId(15191), ILet(Id("""tail"""), ERef(RefId(Id("""__x1__""")))).setId(15192))).setId(15194)).setId(15195), IReturn(EList(List(ERef(RefId(Id("""tail""")))))).setId(15197))).setId(-1))
  /* Beautified form:
  "TemplateSpans0TemplateStrings0" (this, TemplateTail, raw) => {
    if (= raw false) {
      access __x0__ = (TemplateTail "TV")
      let tail = __x0__
    } else {
      access __x1__ = (TemplateTail "TRV")
      let tail = __x1__
    }
    return (new [tail])
  }
  */
}
