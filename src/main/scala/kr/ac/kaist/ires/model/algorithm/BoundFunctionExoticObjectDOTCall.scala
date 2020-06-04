package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BoundFunctionExoticObjectDOTCall {
  val length: Int = 2
  val func: Func = Func("""BoundFunctionExoticObject.Call""", List(Id("""F"""), Id("""thisArgument"""), Id("""argumentsList""")), None, ISeq(List(ILet(Id("""target"""), ERef(RefProp(RefId(Id("""F""")), EStr("""BoundTargetFunction""")))).setId(53653), ILet(Id("""boundThis"""), ERef(RefProp(RefId(Id("""F""")), EStr("""BoundThis""")))).setId(53655), ILet(Id("""boundArgs"""), ERef(RefProp(RefId(Id("""F""")), EStr("""BoundArguments""")))).setId(53657), ILet(Id("""__x0__"""), ECopy(ERef(RefId(Id("""boundArgs"""))))).setId(53659), ILet(Id("""__x1__"""), ERef(RefId(Id("""argumentsList""")))).setId(53661), ILet(Id("""__x2__"""), EINum(0L)).setId(53662), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x3__"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(53663), IAppend(ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""__x0__""")))).setId(53660), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(53664))).setId(53665)).setId(53666), ILet(Id("""args"""), ERef(RefId(Id("""__x0__""")))).setId(53668), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""boundThis"""))), ERef(RefId(Id("""args"""))))).setId(53670), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(53671), IReturn(ERef(RefId(Id("""__x4__""")))).setId(53672)).setId(53673), ISeq(List()).setId(53674)).setId(53675), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(53676), IReturn(ERef(RefId(Id("""__x5__""")))).setId(53677))).setId(-1))
  /* Beautified form:
  "BoundFunctionExoticObject.Call" (F, thisArgument, argumentsList) => {
    let target = F["BoundTargetFunction"]
    let boundThis = F["BoundThis"]
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
    app __x4__ = (Call target boundThis args)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
