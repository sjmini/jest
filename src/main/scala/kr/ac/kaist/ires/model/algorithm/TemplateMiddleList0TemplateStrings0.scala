package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateMiddleList0TemplateStrings0 {
  val length: Int = 0
  val func: Func = Func("""TemplateMiddleList0TemplateStrings0""", List(Id("""this"""), Id("""TemplateMiddle"""), Id("""Expression"""), Id("""raw""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""raw"""))), EBool(false)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateMiddle"""))), EStr("""TV""")).setId(15262), ILet(Id("""string"""), ERef(RefId(Id("""__x0__""")))).setId(15263))).setId(15265), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""TemplateMiddle"""))), EStr("""TRV""")).setId(15267), ILet(Id("""string"""), ERef(RefId(Id("""__x1__""")))).setId(15268))).setId(15270)).setId(15271), IReturn(EList(List(ERef(RefId(Id("""string""")))))).setId(15273))).setId(-1))
  /* Beautified form:
  "TemplateMiddleList0TemplateStrings0" (this, TemplateMiddle, Expression, raw) => {
    if (= raw false) {
      access __x0__ = (TemplateMiddle "TV")
      let string = __x0__
    } else {
      access __x1__ = (TemplateMiddle "TRV")
      let string = __x1__
    }
    return (new [string])
  }
  */
}
