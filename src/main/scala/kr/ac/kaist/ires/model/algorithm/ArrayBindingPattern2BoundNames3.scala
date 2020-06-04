package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayBindingPattern2BoundNames3 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern2BoundNames3""", List(Id("""this"""), Id("""BindingElementList"""), Id("""Elision"""), Id("""BindingRestElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElementList"""))), EStr("""BoundNames""")).setId(27817), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(27818), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingRestElement"""))), EStr("""BoundNames""")).setId(27820), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(27822), ILet(Id("""__x3__"""), EINum(0L)).setId(27823), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(27824), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(27821), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(27825))).setId(27826)).setId(27827), IReturn(ERef(RefId(Id("""names""")))).setId(27830))).setId(-1))
  /* Beautified form:
  "ArrayBindingPattern2BoundNames3" (this, BindingElementList, Elision, BindingRestElement) => {
    access __x0__ = (BindingElementList "BoundNames")
    let names = __x0__
    access __x1__ = (BindingRestElement "BoundNames")
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
