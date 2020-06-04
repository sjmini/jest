package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SubstitutionTemplate0TemplateStrings0 {
  val length: Int = 0
  val func: Func = Func("""SubstitutionTemplate0TemplateStrings0""", List(Id("""this"""), Id("""TemplateHead"""), Id("""Expression"""), Id("""TemplateSpans"""), Id("""raw""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""raw"""))), EBool(false)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateHead"""))), EStr("""TV""")).setId(15143), ILet(Id("""head"""), ERef(RefId(Id("""__x0__""")))).setId(15144))).setId(15146), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""TemplateHead"""))), EStr("""TRV""")).setId(15148), ILet(Id("""head"""), ERef(RefId(Id("""__x1__""")))).setId(15149))).setId(15151)).setId(15152), IAccess(Id("""__x2__"""), ERef(RefId(Id("""TemplateSpans"""))), EStr("""TemplateStrings""")).setId(15154), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""raw"""))))).setId(15155), ILet(Id("""tail"""), ERef(RefId(Id("""__x3__""")))).setId(15156), IReturn(EList(List(ERef(RefId(Id("""head"""))), ERef(RefId(Id("""tail""")))))).setId(15158))).setId(-1))
  /* Beautified form:
  "SubstitutionTemplate0TemplateStrings0" (this, TemplateHead, Expression, TemplateSpans, raw) => {
    if (= raw false) {
      access __x0__ = (TemplateHead "TV")
      let head = __x0__
    } else {
      access __x1__ = (TemplateHead "TRV")
      let head = __x1__
    }
    access __x2__ = (TemplateSpans "TemplateStrings")
    app __x3__ = (__x2__ raw)
    let tail = __x3__
    return (new [head, tail])
  }
  */
}
