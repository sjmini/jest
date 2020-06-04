package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTWeakSetDOTprototypeDOTadd {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.WeakSet.prototype.add""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(87386), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(87387), ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(87389), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""S"""))), EStr("""WeakSetData"""))).setId(87391), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(87392), IReturn(ERef(RefId(Id("""__x1__""")))).setId(87393)).setId(87394), ISeq(List()).setId(87395)).setId(87396), IExpr(ERef(RefId(Id("""__x1__""")))).setId(87397), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""value"""))))).setId(87399), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(87400), IReturn(ERef(RefId(Id("""__x3__""")))).setId(87401))).setId(87402), ISeq(List()).setId(87395)).setId(87403), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""S""")), EStr("""WeakSetData""")))).setId(87405), ILet(Id("""__x4__"""), ERef(RefId(Id("""entries""")))).setId(87421), ILet(Id("""__x5__"""), EINum(0L)).setId(87422), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))).setId(87423), ILet(Id("""__x6__"""), EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(87412), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""e"""))), ERef(RefId(Id("""value"""))))).setId(87407), IAssign(RefId(Id("""__x6__""")), EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(true))).setId(87410))).setId(87411), ISeq(List()).setId(87395)).setId(87413), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""S"""))))).setId(87414), IReturn(ERef(RefId(Id("""__x8__""")))).setId(87415))).setId(87417), ISeq(List()).setId(87395)).setId(87418), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(87424))).setId(87425)).setId(87426), IAppend(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""entries""")))).setId(87429), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""S"""))))).setId(87431), IReturn(ERef(RefId(Id("""__x9__""")))).setId(87432))).setId(-1))
  /* Beautified form:
  "GLOBAL.WeakSet.prototype.add" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let S = this
    app __x1__ = (RequireInternalSlot S "WeakSetData")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (Type value)
    if (! (= __x2__ Object)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
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
        app __x8__ = (WrapCompletion S)
        return __x8__
      } else {}
      __x5__ = (+ __x5__ 1i)
    }
    append value -> entries
    app __x9__ = (WrapCompletion S)
    return __x9__
  }
  */
}
