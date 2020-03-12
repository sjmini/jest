package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorResume {
  val length: Int = 2
  val func: Func = Func("""GeneratorResume""", List(Id("""generator"""), Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GeneratorValidate"""))), List(ERef(RefId(Id("""generator"""))))).setId(10470), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(10471), IReturn(ERef(RefId(Id("""__x0__""")))).setId(10472)).setId(10473), ISeq(List()).setId(10515)).setId(10475), ILet(Id("""state"""), ERef(RefId(Id("""__x0__""")))).setId(10476), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""completed""")), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))).setId(10478), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(10479), IReturn(ERef(RefId(Id("""__x2__""")))).setId(10480))).setId(10521), ISeq(List()).setId(10522)).setId(10482), ILet(Id("""genContext"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""GeneratorContext""")))).setId(10484), ILet(Id("""methodContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(10486), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(10488), IAssign(RefId(Id("""methodContext""")), ENull).setId(10489), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""executing""")).setId(10491), IAppend(ERef(RefId(Id("""genContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(10493), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(10494), IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(10496), IWithCont(Id("""__x4__"""), List(Id("""result""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")), EList(List())).setId(10497), ISeq(List()).setId(10533)).setId(10500), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")))).setId(10501), IApp(Id("""__x5__"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(10502))).setId(10537)).setId(10504), IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))).setId(10506), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(10507), IReturn(ERef(RefId(Id("""__x7__""")))).setId(10508))).setId(10542))
  val instToStepMap: Map[Int, Int] = HashMap(10478 -> 1, 10484 -> 4, 10486 -> 5, 10491 -> 7, 10487 -> 5, 10480 -> 1, 10489 -> 6, 10488 -> 6, 10483 -> 2, 10495 -> 8, 10507 -> 11, 10474 -> 10, 10501 -> 9, 10494 -> 8, 10506 -> 11, 10477 -> 0, 10502 -> 9, 10490 -> 6, 10470 -> 0, 10503 -> 9, 10493 -> 8, 10505 -> 9, 10476 -> 0, 10481 -> 1, 10504 -> 9, 10509 -> 11, 10496 -> 9, 10508 -> 11, 10479 -> 1, 10500 -> 9, 10485 -> 4, 10482 -> 2, 10492 -> 7, 10475 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(10477, 10470, 10476, 10475), 5 -> HashSet(10486, 10487), 10 -> HashSet(10474), 1 -> HashSet(10478, 10480, 10481, 10479), 6 -> HashSet(10490, 10489, 10488), 9 -> HashSet(10501, 10502, 10503, 10505, 10504, 10496, 10500), 2 -> HashSet(10483, 10482), 7 -> HashSet(10491, 10492), 3 -> HashSet(10474), 11 -> HashSet(10507, 10506, 10509, 10508), 8 -> HashSet(10495, 10494, 10493), 4 -> HashSet(10484, 10485))
  /* Beautified form:
  "GeneratorResume" (generator, value) => {
    app __x0__ = (GeneratorValidate generator)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let state = __x0__
    if (= state "completed") {
      app __x1__ = (CreateIterResultObject undefined true)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    let genContext = generator["GeneratorContext"]
    let methodContext = GLOBAL_context
    GLOBAL_context = null
    methodContext = null
    generator["GeneratorState"] = "executing"
    append genContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x3__ = (NormalCompletion value)
    withcont __x4__ (result) ={
      if (= genContext["ReturnCont"] absent) genContext["ReturnCont"] = (new []) else {}
      append __x4__ -> genContext["ReturnCont"]
      app __x5__ = (genContext["ResumeCont"] __x3__)
    }
    app __x6__ = (Completion result)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
