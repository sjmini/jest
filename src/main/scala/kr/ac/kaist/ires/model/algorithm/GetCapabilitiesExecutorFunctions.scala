package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetCapabilitiesExecutorFunctions {
  val length: Int = 0
  val func: Func = Func("""GetCapabilitiesExecutorFunctions""", List(), None, ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(12300), ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Capability""")))).setId(12303), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(12305), IReturn(ERef(RefId(Id("""__x0__""")))).setId(12306))).setId(12307), ISeq(List()).setId(12302)).setId(12308), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(12310), IReturn(ERef(RefId(Id("""__x1__""")))).setId(12311))).setId(12312), ISeq(List()).setId(12302)).setId(12313), IAssign(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve""")), ERef(RefId(Id("""resolve""")))).setId(12315), IAssign(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject""")), ERef(RefId(Id("""reject""")))).setId(12317), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(12319), IReturn(ERef(RefId(Id("""__x2__""")))).setId(12320))).setId(-1))
  /* Beautified form:
  "GetCapabilitiesExecutorFunctions" () => {
    let F = GLOBAL_context["Function"]
    let promiseCapability = F["Capability"]
    if (! (= promiseCapability["Resolve"] undefined)) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    if (! (= promiseCapability["Reject"] undefined)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    promiseCapability["Resolve"] = resolve
    promiseCapability["Reject"] = reject
    app __x2__ = (WrapCompletion undefined)
    return __x2__
  }
  */
}
