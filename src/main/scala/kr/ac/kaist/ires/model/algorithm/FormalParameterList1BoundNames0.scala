package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameterList1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameterList1BoundNames0""", List(Id("""this"""), Id("""FormalParameterList"""), Id("""FormalParameter""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FormalParameterList"""))), EStr("""BoundNames""")).setId(37760), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(37761), IAccess(Id("""__x1__"""), ERef(RefId(Id("""FormalParameter"""))), EStr("""BoundNames""")).setId(37763), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(37765), ILet(Id("""__x3__"""), EINum(0L)).setId(37766), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(37767), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(37764), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(37768))).setId(37769)).setId(37770), IReturn(ERef(RefId(Id("""names""")))).setId(37773))).setId(-1))
  /* Beautified form:
  "FormalParameterList1BoundNames0" (this, FormalParameterList, FormalParameter) => {
    access __x0__ = (FormalParameterList "BoundNames")
    let names = __x0__
    access __x1__ = (FormalParameter "BoundNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> names
      __x3__ = (+ __x3__ 1i)
    }
    return names
  }
  */
}
