package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AddRestrictedFunctionProperties {
  val length: Int = 2
  val func: Func = Func("""AddRestrictedFunctionProperties""", List(Id("""F"""), Id("""realm""")), None, ISeq(List(ILet(Id("""thrower"""), ERef(RefProp(RefProp(RefId(Id("""realm""")), EStr("""Intrinsics""")), EStr("""INTRINSIC_ThrowTypeError""")))).setId(52279), IApp(Id("""__x0__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""caller"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Get"""), ERef(RefId(Id("""thrower""")))), (EStr("""Set"""), ERef(RefId(Id("""thrower""")))), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))).setId(52281), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(52282), IReturn(ERef(RefId(Id("""__x0__""")))).setId(52283)).setId(52284), ISeq(List()).setId(52278)).setId(52285), IExpr(ERef(RefId(Id("""__x0__""")))).setId(52286), IApp(Id("""__x1__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""arguments"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Get"""), ERef(RefId(Id("""thrower""")))), (EStr("""Set"""), ERef(RefId(Id("""thrower""")))), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))).setId(52288), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(52289), IReturn(ERef(RefId(Id("""__x1__""")))).setId(52290)).setId(52291), ISeq(List()).setId(52278)).setId(52292), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(52293), IReturn(ERef(RefId(Id("""__x2__""")))).setId(52294))).setId(-1))
  /* Beautified form:
  "AddRestrictedFunctionProperties" (F, realm) => {
    let thrower = realm["Intrinsics"]["INTRINSIC_ThrowTypeError"]
    app __x0__ = (DefinePropertyOrThrow F "caller" (new PropertyDescriptor("Get" -> thrower, "Set" -> thrower, "Enumerable" -> false, "Configurable" -> true)))
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (DefinePropertyOrThrow F "arguments" (new PropertyDescriptor("Get" -> thrower, "Set" -> thrower, "Enumerable" -> false, "Configurable" -> true)))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
