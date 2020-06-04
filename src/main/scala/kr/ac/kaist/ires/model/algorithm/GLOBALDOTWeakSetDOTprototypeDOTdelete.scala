package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTWeakSetDOTprototypeDOTdelete {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.WeakSet.prototype.delete""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(87511), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(87512), ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(87514), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""S"""))), EStr("""WeakSetData"""))).setId(87516), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(87517), IReturn(ERef(RefId(Id("""__x1__""")))).setId(87518)).setId(87519), ISeq(List()).setId(87520)).setId(87521), IExpr(ERef(RefId(Id("""__x1__""")))).setId(87522), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(87524), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(87525), IReturn(ERef(RefId(Id("""__x3__""")))).setId(87526))).setId(87527), ISeq(List()).setId(87520)).setId(87528), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""S""")), EStr("""WeakSetData""")))).setId(87530), ILet(Id("""__x4__"""), ERef(RefId(Id("""entries""")))).setId(87547), ILet(Id("""__x5__"""), EINum(0L)).setId(87548), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))).setId(87549), ILet(Id("""__x6__"""), EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(87537), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""e"""))), ERef(RefId(Id("""value"""))))).setId(87532), IAssign(RefId(Id("""__x6__""")), EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(true))).setId(87535))).setId(87536), ISeq(List()).setId(87520)).setId(87538), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(87539), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(87540), IReturn(ERef(RefId(Id("""__x8__""")))).setId(87541))).setId(87543), ISeq(List()).setId(87520)).setId(87544), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(87550))).setId(87551)).setId(87552), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(87555), IReturn(ERef(RefId(Id("""__x9__""")))).setId(87556))).setId(-1))
  /* Beautified form:
  "GLOBAL.WeakSet.prototype.delete" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let S = this
    app __x1__ = (RequireInternalSlot S "WeakSetData")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (Type value)
    if (! (= __x2__ Object)) {
      app __x3__ = (WrapCompletion false)
      return __x3__
    } else {}
    let entries = S["WeakSetData"]
    let __x4__ = entries
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let e = __x4__[__x5__]
      let __x6__ = (! (= e CONST_empty))
      if __x6__ {
        app __x7__ = (SameValue e value)
        __x6__ = (= __x7__ true)
      } else {}
      if __x6__ {
        !!! "Etc"
        app __x8__ = (WrapCompletion true)
        return __x8__
      } else {}
      __x5__ = (+ __x5__ 1i)
    }
    app __x9__ = (WrapCompletion false)
    return __x9__
  }
  */
}
