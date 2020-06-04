package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateSpans1TemplateStrings0 {
  val length: Int = 0
  val func: Func = Func("""TemplateSpans1TemplateStrings0""", List(Id("""this"""), Id("""TemplateMiddleList"""), Id("""TemplateTail"""), Id("""raw""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateMiddleList"""))), EStr("""TemplateStrings""")).setId(15218), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""raw"""))))).setId(15219), ILet(Id("""middle"""), ERef(RefId(Id("""__x1__""")))).setId(15220), IIf(EBOp(OEq, ERef(RefId(Id("""raw"""))), EBool(false)), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""TemplateTail"""))), EStr("""TV""")).setId(15223), ILet(Id("""tail"""), ERef(RefId(Id("""__x2__""")))).setId(15224))).setId(15226), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""TemplateTail"""))), EStr("""TRV""")).setId(15228), ILet(Id("""tail"""), ERef(RefId(Id("""__x3__""")))).setId(15229))).setId(15231)).setId(15232), IReturn(EList(List(ERef(RefId(Id("""middle"""))), ERef(RefId(Id("""tail""")))))).setId(15234))).setId(-1))
  /* Beautified form:
  "TemplateSpans1TemplateStrings0" (this, TemplateMiddleList, TemplateTail, raw) => {
    access __x0__ = (TemplateMiddleList "TemplateStrings")
    app __x1__ = (__x0__ raw)
    let middle = __x1__
    if (= raw false) {
      access __x2__ = (TemplateTail "TV")
      let tail = __x2__
    } else {
      access __x3__ = (TemplateTail "TRV")
      let tail = __x3__
    }
    return (new [middle, tail])
  }
  */
}
