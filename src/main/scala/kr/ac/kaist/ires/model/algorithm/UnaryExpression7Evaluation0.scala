package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression7Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression7Evaluation0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UnaryExpression"""))), EStr("""Evaluation""")).setId(19638), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))).setId(19639), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""expr"""))))).setId(19641), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(19642), IReturn(ERef(RefId(Id("""__x1__""")))).setId(19643)).setId(19644), ISeq(List()).setId(19669)).setId(19646), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(19647), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(19648), IReturn(ERef(RefId(Id("""__x2__""")))).setId(19649)).setId(19650), ISeq(List()).setId(19675)).setId(19651), ILet(Id("""oldValue"""), ERef(RefId(Id("""__x2__""")))).setId(19652), IIf(EBOp(OEq, ERef(RefId(Id("""oldValue"""))), EBool(true)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(19654), IReturn(ERef(RefId(Id("""__x3__""")))).setId(19655))).setId(19680), ISeq(List()).setId(19681)).setId(19657), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(19659), IReturn(ERef(RefId(Id("""__x4__""")))).setId(19660))).setId(19685))
  val instToStepMap: Map[Int, Int] = HashMap(19640 -> 0, 19658 -> 3, 19661 -> 4, 19639 -> 0, 19652 -> 1, 19647 -> 1, 19659 -> 4, 19638 -> 0, 19660 -> 4, 19656 -> 2, 19646 -> 1, 19654 -> 2, 19657 -> 3, 19653 -> 1, 19655 -> 2, 19641 -> 1, 19651 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(19640, 19639, 19638), 1 -> HashSet(19653, 19652, 19647, 19646, 19641, 19651), 2 -> HashSet(19655, 19656, 19654), 3 -> HashSet(19658, 19657), 4 -> HashSet(19661, 19659, 19660))
  /* Beautified form:
  "UnaryExpression7Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let expr = __x0__
    app __x1__ = (GetValue expr)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToBoolean __x1__)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let oldValue = __x2__
    if (= oldValue true) {
      app __x3__ = (WrapCompletion false)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion true)
    return __x4__
  }
  */
}
