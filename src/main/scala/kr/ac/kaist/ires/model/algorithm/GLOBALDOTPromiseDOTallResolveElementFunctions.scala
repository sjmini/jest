package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseDOTallResolveElementFunctions {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Promise.allResolveElementFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(92214), ILet(Id("""alreadyCalled"""), ERef(RefProp(RefId(Id("""F""")), EStr("""AlreadyCalled""")))).setId(92216), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""alreadyCalled""")), EStr("""Value"""))), EBool(true)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(92218), IReturn(ERef(RefId(Id("""__x0__""")))).setId(92219))).setId(92220), ISeq(List()).setId(92221)).setId(92222), IAssign(RefProp(RefId(Id("""alreadyCalled""")), EStr("""Value""")), EBool(true)).setId(92224), ILet(Id("""index"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Index""")))).setId(92226), ILet(Id("""values"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Values""")))).setId(92228), ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Capability""")))).setId(92230), ILet(Id("""remainingElementsCount"""), ERef(RefProp(RefId(Id("""F""")), EStr("""RemainingElements""")))).setId(92232), IAssign(RefProp(RefId(Id("""values""")), ERef(RefId(Id("""index""")))), ERef(RefId(Id("""x""")))).setId(92234), IAssign(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value""")), EBOp(OSub, ERef(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value"""))), EINum(1L))).setId(92236), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""remainingElementsCount""")), EStr("""Value"""))), EINum(0L)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(ERef(RefId(Id("""values"""))))).setId(92238), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(92239), IReturn(ERef(RefId(Id("""__x1__""")))).setId(92240)).setId(92241), ISeq(List()).setId(92221)).setId(92242), ILet(Id("""valuesArray"""), ERef(RefId(Id("""__x1__""")))).setId(92243), IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefId(Id("""valuesArray"""))))))).setId(92245), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(92246), IReturn(ERef(RefId(Id("""__x2__""")))).setId(92247)).setId(92248), ISeq(List()).setId(92221)).setId(92249), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(92250), IReturn(ERef(RefId(Id("""__x3__""")))).setId(92251))).setId(92253), ISeq(List()).setId(92221)).setId(92254), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(92256), IReturn(ERef(RefId(Id("""__x4__""")))).setId(92257))).setId(-1))
  /* Beautified form:
  "GLOBAL.Promise.allResolveElementFunctions" (this, argumentsList, NewTarget) => {
    let F = GLOBAL_context["Function"]
    let alreadyCalled = F["AlreadyCalled"]
    if (= alreadyCalled["Value"] true) {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    alreadyCalled["Value"] = true
    let index = F["Index"]
    let values = F["Values"]
    let promiseCapability = F["Capability"]
    let remainingElementsCount = F["RemainingElements"]
    values[index] = x
    remainingElementsCount["Value"] = (- remainingElementsCount["Value"] 1i)
    if (= remainingElementsCount["Value"] 0i) {
      app __x1__ = (CreateArrayFromList values)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let valuesArray = __x1__
      app __x2__ = (Call promiseCapability["Resolve"] undefined (new [valuesArray]))
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion undefined)
    return __x4__
  }
  */
}
