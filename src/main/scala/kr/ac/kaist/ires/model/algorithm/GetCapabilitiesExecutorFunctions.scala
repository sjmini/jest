package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GetCapabilitiesExecutorFunctions {
  val length: Int = 0
  val func: Func = Func("""GetCapabilitiesExecutorFunctions""", List(), None, ISeq(List(ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(12300), ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Capability""")))).setId(12303), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(12305), IReturn(ERef(RefId(Id("""__x0__""")))).setId(12306))).setId(12327), ISeq(List()).setId(12328)).setId(12308), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(12310), IReturn(ERef(RefId(Id("""__x1__""")))).setId(12311))).setId(12332), ISeq(List()).setId(12333)).setId(12313), IAssign(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve""")), ERef(RefId(Id("""resolve""")))).setId(12315), IAssign(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject""")), ERef(RefId(Id("""reject""")))).setId(12317), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(12319), IReturn(ERef(RefId(Id("""__x2__""")))).setId(12320))).setId(12339))
  val instToStepMap: Map[Int, Int] = HashMap(12303 -> 2, 12319 -> 9, 12300 -> 0, 12314 -> 6, 12310 -> 5, 12313 -> 6, 12302 -> 1, 12316 -> 7, 12311 -> 5, 12315 -> 7, 12306 -> 3, 12321 -> 9, 12304 -> 2, 12305 -> 3, 12318 -> 8, 12317 -> 8, 12301 -> 0, 12309 -> 4, 12308 -> 4, 12312 -> 5, 12307 -> 3, 12320 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(12300, 12301), 5 -> HashSet(12311, 12310, 12312), 1 -> HashSet(12302), 6 -> HashSet(12314, 12313), 9 -> HashSet(12319, 12321, 12320), 2 -> HashSet(12303, 12304), 7 -> HashSet(12315, 12316), 3 -> HashSet(12306, 12305, 12307), 8 -> HashSet(12318, 12317), 4 -> HashSet(12309, 12308))
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
