package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BoundFunctionExoticObjectDOTConstruct {
  val length: Int = 2
  val func: Func = Func("""BoundFunctionExoticObject.Construct""", List(Id("""F"""), Id("""argumentsList"""), Id("""newTarget""")), None, ISeq(List(ILet(Id("""target"""), ERef(RefProp(RefId(Id("""F""")), EStr("""BoundTargetFunction""")))).setId(53722), ILet(Id("""boundArgs"""), ERef(RefProp(RefId(Id("""F""")), EStr("""BoundArguments""")))).setId(53725), ILet(Id("""__x0__"""), ECopy(ERef(RefId(Id("""boundArgs"""))))).setId(53727), ILet(Id("""__x1__"""), ERef(RefId(Id("""argumentsList""")))).setId(53729), ILet(Id("""__x2__"""), EINum(0L)).setId(53730), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x3__"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(53731), IAppend(ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""__x0__""")))).setId(53728), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(53732))).setId(53733)).setId(53734), ILet(Id("""args"""), ERef(RefId(Id("""__x0__""")))).setId(53736), IApp(Id("""__x4__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""newTarget"""))))).setId(53738), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true)), IAssign(RefId(Id("""newTarget""")), ERef(RefId(Id("""target""")))).setId(53739), ISeq(List()).setId(53724)).setId(53741), IApp(Id("""__x5__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""args"""))), ERef(RefId(Id("""newTarget"""))))).setId(53743), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(53744), IReturn(ERef(RefId(Id("""__x5__""")))).setId(53745)).setId(53746), ISeq(List()).setId(53724)).setId(53747), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(53748), IReturn(ERef(RefId(Id("""__x6__""")))).setId(53749))).setId(-1))
  /* Beautified form:
  "BoundFunctionExoticObject.Construct" (F, argumentsList, newTarget) => {
    let target = F["BoundTargetFunction"]
    let boundArgs = F["BoundArguments"]
    let __x0__ = (copy-obj boundArgs)
    let __x1__ = argumentsList
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let __x3__ = __x1__[__x2__]
      append __x3__ -> __x0__
      __x2__ = (+ __x2__ 1i)
    }
    let args = __x0__
    app __x4__ = (SameValue F newTarget)
    if (= __x4__ true) newTarget = target else {}
    app __x5__ = (Construct target args newTarget)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
