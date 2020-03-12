package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTAwaitFulfilledFunctions {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.AwaitFulfilledFunctions""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(61359), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(61360), ILet(Id("""F"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(61362), ILet(Id("""asyncContext"""), ERef(RefProp(RefId(Id("""F""")), EStr("""AsyncContext""")))).setId(61364), ILet(Id("""prevContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(61366), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(61368), IAssign(RefId(Id("""prevContext""")), ENull).setId(61369), IAppend(ERef(RefId(Id("""asyncContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(61371), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(61372), IApp(Id("""__x1__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(61374), IWithCont(Id("""__x2__"""), List(), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont""")), EList(List())).setId(61375), ISeq(List()).setId(61400)).setId(61378), IAppend(ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont""")))).setId(61379), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ResumeCont"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(61380))).setId(61404)).setId(61382), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(61385), IReturn(ERef(RefId(Id("""__x4__""")))).setId(61386))).setId(61408))
  val instToStepMap: Map[Int, Int] = HashMap(61380 -> 6, 61365 -> 2, 61366 -> 3, 61371 -> 5, 61368 -> 4, 61381 -> 6, 61362 -> 1, 61387 -> 8, 61359 -> 0, 61374 -> 6, 61383 -> 6, 61364 -> 2, 61386 -> 8, 61369 -> 4, 61385 -> 8, 61360 -> 0, 61384 -> 7, 61361 -> 0, 61370 -> 4, 61373 -> 5, 61382 -> 6, 61367 -> 3, 61378 -> 6, 61363 -> 1, 61372 -> 5, 61379 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(61360, 61361, 61359), 5 -> HashSet(61371, 61373, 61372), 1 -> HashSet(61362, 61363), 6 -> HashSet(61380, 61381, 61382, 61378, 61374, 61383, 61379), 2 -> HashSet(61365, 61364), 7 -> HashSet(61384), 3 -> HashSet(61366, 61367), 8 -> HashSet(61385, 61387, 61386), 4 -> HashSet(61368, 61370, 61369))
  /* Beautified form:
  "GLOBAL.AwaitFulfilledFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let F = GLOBAL_context["Function"]
    let asyncContext = F["AsyncContext"]
    let prevContext = GLOBAL_context
    GLOBAL_context = null
    prevContext = null
    append asyncContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x1__ = (NormalCompletion value)
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
