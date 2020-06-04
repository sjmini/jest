package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTGeneratorValidate {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.GeneratorValidate""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(88998), ILet(Id("""generator"""), ERef(RefId(Id("""__x0__""")))).setId(88999), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""generator"""))), EStr("""GeneratorState"""))).setId(89001), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(89002), IReturn(ERef(RefId(Id("""__x1__""")))).setId(89003)).setId(89004), ISeq(List()).setId(89005)).setId(89006), IExpr(ERef(RefId(Id("""__x1__""")))).setId(89007), ILet(Id("""state"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")))).setId(89009), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""executing""")), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(89011), IReturn(ERef(RefId(Id("""__x2__""")))).setId(89012))).setId(89013), ISeq(List()).setId(89005)).setId(89014), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""state"""))))).setId(89016), IReturn(ERef(RefId(Id("""__x3__""")))).setId(89017))).setId(-1))
  /* Beautified form:
  "GLOBAL.GeneratorValidate" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    app __x1__ = (RequireInternalSlot generator "GeneratorState")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    let state = generator["GeneratorState"]
    if (= state "executing") {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion state)
    return __x3__
  }
  */
}
