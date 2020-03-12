package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorResumeAbrupt {
  val length: Int = 2
  val func: Func = Func("""GeneratorResumeAbrupt""", List(Id("""generator"""), Id("""abruptCompletion""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GeneratorValidate"""))), List(ERef(RefId(Id("""generator"""))))).setId(10575), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(10576), IReturn(ERef(RefId(Id("""__x0__""")))).setId(10577)).setId(10578), ISeq(List()).setId(10634)).setId(10580), ILet(Id("""state"""), ERef(RefId(Id("""__x0__""")))).setId(10581), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""suspendedStart""")), ISeq(List(IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""completed""")).setId(10583), IAssign(RefId(Id("""state""")), EStr("""completed""")).setId(10585))).setId(10639), ISeq(List()).setId(10640)).setId(10588), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""completed""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""abruptCompletion""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefProp(RefId(Id("""abruptCompletion""")), EStr("""Value"""))), EBool(true))).setId(10590), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(10591), IReturn(ERef(RefId(Id("""__x2__""")))).setId(10592))).setId(10645), ISeq(List()).setId(10646)).setId(10595), IApp(Id("""__x3__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""abruptCompletion"""))))).setId(10597), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(10598), IReturn(ERef(RefId(Id("""__x4__""")))).setId(10599))).setId(10651), ISeq(List()).setId(10652)).setId(10602), ILet(Id("""genContext"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""GeneratorContext""")))).setId(10604), ILet(Id("""methodContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(10606), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(10608), IAssign(RefId(Id("""methodContext""")), ENull).setId(10609), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""executing""")).setId(10611), IAppend(ERef(RefId(Id("""genContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(10613), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(10614), IWithCont(Id("""__x5__"""), List(Id("""result""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")), EList(List())).setId(10616), ISeq(List()).setId(10662)).setId(10619), IAppend(ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")))).setId(10620), IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont"""))), List(ERef(RefId(Id("""abruptCompletion"""))))).setId(10621))).setId(10666)).setId(10623), IApp(Id("""__x7__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))).setId(10625), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(10626), IReturn(ERef(RefId(Id("""__x8__""")))).setId(10627))).setId(10671))
  val instToStepMap: Map[Int, Int] = HashMap(10609 -> 18, 10594 -> 11, 10612 -> 19, 10620 -> 21, 10582 -> 0, 10581 -> 0, 10595 -> 13, 10600 -> 13, 10622 -> 21, 10586 -> 5, 10599 -> 13, 10584 -> 5, 10619 -> 21, 10587 -> 5, 10606 -> 17, 10626 -> 23, 10602 -> 14, 10623 -> 21, 10591 -> 11, 10593 -> 11, 10598 -> 13, 10583 -> 5, 10615 -> 20, 10580 -> 0, 10575 -> 0, 10603 -> 14, 10588 -> 6, 10597 -> 13, 10614 -> 20, 10624 -> 21, 10592 -> 11, 10607 -> 17, 10625 -> 23, 10611 -> 19, 10596 -> 13, 10621 -> 21, 10628 -> 23, 10579 -> 22, 10589 -> 6, 10604 -> 16, 10585 -> 5, 10613 -> 20, 10608 -> 18, 10605 -> 16, 10610 -> 18, 10627 -> 23, 10601 -> 13, 10590 -> 11)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(10580, 10575, 10582, 10581), 5 -> HashSet(10584, 10587, 10583, 10579, 10585, 10586), 14 -> HashSet(10602, 10603), 20 -> HashSet(10615, 10614, 10613), 6 -> HashSet(10588, 10589), 21 -> HashSet(10619, 10623, 10620, 10624, 10621, 10622), 13 -> HashSet(10599, 10598, 10597, 10596, 10595, 10600, 10601), 17 -> HashSet(10606, 10607), 22 -> HashSet(10579), 12 -> HashSet(10596, 10595), 3 -> HashSet(10584, 10583), 18 -> HashSet(10609, 10608, 10610), 16 -> HashSet(10604, 10605), 11 -> HashSet(10594, 10591, 10593, 10592, 10590), 23 -> HashSet(10626, 10625, 10628, 10627), 19 -> HashSet(10612, 10611), 4 -> HashSet(10579), 15 -> HashSet(10579))
  /* Beautified form:
  "GeneratorResumeAbrupt" (generator, abruptCompletion) => {
    app __x0__ = (GeneratorValidate generator)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let state = __x0__
    if (= state "suspendedStart") {
      generator["GeneratorState"] = "completed"
      state = "completed"
    } else {}
    if (= state "completed") {
      if (= abruptCompletion["Type"] CONST_return) {
        app __x1__ = (CreateIterResultObject abruptCompletion["Value"] true)
        app __x2__ = (WrapCompletion __x1__)
        return __x2__
      } else {}
      app __x3__ = (Completion abruptCompletion)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    let genContext = generator["GeneratorContext"]
    let methodContext = GLOBAL_context
    GLOBAL_context = null
    methodContext = null
    generator["GeneratorState"] = "executing"
    append genContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    withcont __x5__ (result) ={
      if (= genContext["ReturnCont"] absent) genContext["ReturnCont"] = (new []) else {}
      append __x5__ -> genContext["ReturnCont"]
      app __x6__ = (genContext["ResumeCont"] abruptCompletion)
    }
    app __x7__ = (Completion result)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
