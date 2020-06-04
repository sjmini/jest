package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryOwnPropertyKeys {
  val length: Int = 1
  val func: Func = Func("""OrdinaryOwnPropertyKeys""", List(Id("""O""")), None, ISeq(List(ILet(Id("""keys"""), EList(List())).setId(50979), ILet(Id("""__x0__"""), EKeys(ERef(RefProp(RefId(Id("""O""")), EStr("""SubMap"""))))).setId(50981), ILet(Id("""__x1__"""), ERef(RefId(Id("""__x0__""")))).setId(50983), ILet(Id("""__x2__"""), EINum(0L)).setId(50984), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x3__"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(50985), IAppend(ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""keys""")))).setId(50982), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(50986))).setId(50987)).setId(50988), IReturn(ERef(RefId(Id("""keys""")))).setId(50990), IExpr(ENotSupported("""Etc""")).setId(50992), IExpr(ENotSupported("""Etc""")).setId(50992), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""keys"""))))).setId(50993), IReturn(ERef(RefId(Id("""__x4__""")))).setId(50994))).setId(-1))
  /* Beautified form:
  "OrdinaryOwnPropertyKeys" (O) => {
    let keys = (new [])
    let __x0__ = (map-keys O["SubMap"])
    let __x1__ = __x0__
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let __x3__ = __x1__[__x2__]
      append __x3__ -> keys
      __x2__ = (+ __x2__ 1i)
    }
    return keys
    !!! "Etc"
    !!! "Etc"
    app __x4__ = (WrapCompletion keys)
    return __x4__
  }
  */
}
