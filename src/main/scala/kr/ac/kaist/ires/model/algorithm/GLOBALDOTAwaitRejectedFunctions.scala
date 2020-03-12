package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTAwaitRejectedFunctions {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.AwaitRejectedFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(61429), ILet(Id("""reason"""), ERef(RefId(Id("""__x0__""")))).setId(61430), ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(61432), ILet(Id("""asyncContext"""), ERef(RefProp(RefId(Id("""F""")), EStr("""AsyncContext""")))).setId(61434), ILet(Id("""prevContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(61436), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(61438), IAssign(RefId(Id("""prevContext""")), ENull).setId(61439), IAppend(ERef(RefId(Id("""asyncContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(61441), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(61442), IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(ERef(RefId(Id("""reason"""))))).setId(61444), IWithCont(Id("""__x2__"""), List(), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont""")), EList(List())).setId(61445), ISeq(List()).setId(61470)).setId(61448), IAppend(ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont""")))).setId(61449), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ResumeCont"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(61450))).setId(61474)).setId(61452), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(61455), IReturn(ERef(RefId(Id("""__x4__""")))).setId(61456))).setId(61478))
  val instToStepMap: Map[Int, Int] = HashMap(61456 -> 8, 61452 -> 6, 61457 -> 8, 61444 -> 6, 61455 -> 8, 61430 -> 0, 61438 -> 4, 61435 -> 2, 61450 -> 6, 61454 -> 7, 61434 -> 2, 61442 -> 5, 61449 -> 6, 61436 -> 3, 61453 -> 6, 61433 -> 1, 61429 -> 0, 61439 -> 4, 61451 -> 6, 61432 -> 1, 61448 -> 6, 61441 -> 5, 61431 -> 0, 61437 -> 3, 61440 -> 4, 61443 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(61429, 61430, 61431), 5 -> HashSet(61441, 61442, 61443), 1 -> HashSet(61432, 61433), 6 -> HashSet(61452, 61444, 61451, 61448, 61450, 61449, 61453), 2 -> HashSet(61435, 61434), 7 -> HashSet(61454), 3 -> HashSet(61437, 61436), 8 -> HashSet(61456, 61457, 61455), 4 -> HashSet(61439, 61438, 61440))
  /* Beautified form:
  "GLOBAL.AwaitRejectedFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let reason = __x0__
    let F = GLOBAL_context["Function"]
    let asyncContext = F["AsyncContext"]
    let prevContext = GLOBAL_context
    GLOBAL_context = null
    prevContext = null
    append asyncContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x1__ = (ThrowCompletion reason)
    withcont __x2__ () ={
      if (= asyncContext["ReturnCont"] absent) asyncContext["ReturnCont"] = (new []) else {}
      append __x2__ -> asyncContext["ReturnCont"]
      app __x3__ = (asyncContext["ResumeCont"] __x1__)
    }
    app __x4__ = (WrapCompletion undefined)
    return __x4__
  }
  */
}
