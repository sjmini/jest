package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTGetCapabilitiesExecutorFunctions {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.GetCapabilitiesExecutorFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(91165), ILet(Id("""resolve"""), ERef(RefId(Id("""__x0__""")))).setId(91166), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(91168), ILet(Id("""reject"""), ERef(RefId(Id("""__x1__""")))).setId(91169), ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(91171), ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Capability""")))).setId(91174), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(91176), IReturn(ERef(RefId(Id("""__x2__""")))).setId(91177))).setId(91178), ISeq(List()).setId(91173)).setId(91179), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(91181), IReturn(ERef(RefId(Id("""__x3__""")))).setId(91182))).setId(91183), ISeq(List()).setId(91173)).setId(91184), IAssign(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve""")), ERef(RefId(Id("""resolve""")))).setId(91186), IAssign(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject""")), ERef(RefId(Id("""reject""")))).setId(91188), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(91190), IReturn(ERef(RefId(Id("""__x4__""")))).setId(91191))).setId(-1))
  /* Beautified form:
  "GLOBAL.GetCapabilitiesExecutorFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let resolve = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let reject = __x1__
    let F = GLOBAL_context["Function"]
    let promiseCapability = F["Capability"]
    if (! (= promiseCapability["Resolve"] undefined)) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    if (! (= promiseCapability["Reject"] undefined)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    promiseCapability["Resolve"] = resolve
    promiseCapability["Reject"] = reject
    app __x4__ = (WrapCompletion undefined)
    return __x4__
  }
  */
}
