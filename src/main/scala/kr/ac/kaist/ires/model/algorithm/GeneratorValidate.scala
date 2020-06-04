package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorValidate {
  val length: Int = 1
  val func: Func = Func("""GeneratorValidate""", List(Id("""generator""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""generator"""))), EStr("""GeneratorState"""))).setId(10419), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(10420), IReturn(ERef(RefId(Id("""__x0__""")))).setId(10421)).setId(10422), ISeq(List()).setId(10423)).setId(10424), IExpr(ERef(RefId(Id("""__x0__""")))).setId(10425), ILet(Id("""state"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")))).setId(10427), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""executing""")), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(10429), IReturn(ERef(RefId(Id("""__x1__""")))).setId(10430))).setId(10431), ISeq(List()).setId(10423)).setId(10432), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""state"""))))).setId(10434), IReturn(ERef(RefId(Id("""__x2__""")))).setId(10435))).setId(-1))
  /* Beautified form:
  "GeneratorValidate" (generator) => {
    app __x0__ = (RequireInternalSlot generator "GeneratorState")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    let state = generator["GeneratorState"]
    if (= state "executing") {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (WrapCompletion state)
    return __x2__
  }
  */
}
