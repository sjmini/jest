package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTGetCapabilitiesExecutorFunctions {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.GetCapabilitiesExecutorFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(91165), ILet(Id("""resolve"""), ERef(RefId(Id("""__x0__""")))).setId(91166), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(91168), ILet(Id("""reject"""), ERef(RefId(Id("""__x1__""")))).setId(91169), ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(91171), ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Capability""")))).setId(91174), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(91176), IReturn(ERef(RefId(Id("""__x2__""")))).setId(91177))).setId(91202), ISeq(List()).setId(91203)).setId(91179), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(91181), IReturn(ERef(RefId(Id("""__x3__""")))).setId(91182))).setId(91207), ISeq(List()).setId(91208)).setId(91184), IAssign(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve""")), ERef(RefId(Id("""resolve""")))).setId(91186), IAssign(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject""")), ERef(RefId(Id("""reject""")))).setId(91188), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(91190), IReturn(ERef(RefId(Id("""__x4__""")))).setId(91191))).setId(91214))
  val instToStepMap: Map[Int, Int] = HashMap(91190 -> 11, 91175 -> 4, 91166 -> 0, 91171 -> 2, 91184 -> 8, 91179 -> 6, 91176 -> 5, 91191 -> 11, 91172 -> 2, 91187 -> 9, 91178 -> 5, 91181 -> 7, 91168 -> 1, 91169 -> 1, 91173 -> 3, 91192 -> 11, 91167 -> 0, 91170 -> 1, 91180 -> 6, 91174 -> 4, 91165 -> 0, 91182 -> 7, 91183 -> 7, 91185 -> 8, 91186 -> 9, 91188 -> 10, 91177 -> 5, 91189 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(91166, 91165, 91167), 5 -> HashSet(91176, 91178, 91177), 10 -> HashSet(91188, 91189), 1 -> HashSet(91168, 91169, 91170), 6 -> HashSet(91179, 91180), 9 -> HashSet(91187, 91186), 2 -> HashSet(91171, 91172), 7 -> HashSet(91182, 91183, 91181), 3 -> HashSet(91173), 11 -> HashSet(91190, 91191, 91192), 8 -> HashSet(91184, 91185), 4 -> HashSet(91175, 91174))
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
