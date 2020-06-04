package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TemplateMiddleList1TemplateStrings0 {
  val length: Int = 0
  val func: Func = Func("""TemplateMiddleList1TemplateStrings0""", List(Id("""this"""), Id("""TemplateMiddleList"""), Id("""TemplateMiddle"""), Id("""Expression"""), Id("""raw""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""TemplateMiddleList"""))), EStr("""TemplateStrings""")).setId(15294), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""raw"""))))).setId(15295), ILet(Id("""front"""), ERef(RefId(Id("""__x1__""")))).setId(15296), IIf(EBOp(OEq, ERef(RefId(Id("""raw"""))), EBool(false)), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""TemplateMiddle"""))), EStr("""TV""")).setId(15299), ILet(Id("""last"""), ERef(RefId(Id("""__x2__""")))).setId(15300))).setId(15302), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""TemplateMiddle"""))), EStr("""TRV""")).setId(15304), ILet(Id("""last"""), ERef(RefId(Id("""__x3__""")))).setId(15305))).setId(15307)).setId(15308), IAppend(ERef(RefId(Id("""last"""))), ERef(RefId(Id("""front""")))).setId(15310), IReturn(ERef(RefId(Id("""front""")))).setId(15312))).setId(-1))
  /* Beautified form:
  "TemplateMiddleList1TemplateStrings0" (this, TemplateMiddleList, TemplateMiddle, Expression, raw) => {
    access __x0__ = (TemplateMiddleList "TemplateStrings")
    app __x1__ = (__x0__ raw)
    let front = __x1__
    if (= raw false) {
      access __x2__ = (TemplateMiddle "TV")
      let last = __x2__
    } else {
      access __x3__ = (TemplateMiddle "TRV")
      let last = __x3__
    }
    append last -> front
    return front
  }
  */
}
