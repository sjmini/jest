package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement0LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement0LabelledEvaluation0""", List(Id("""this"""), Id("""Statement"""), Id("""Expression"""), Id("""labelSet""")), None, ISeq(List(ILet(Id("""V"""), EUndef).setId(30736), IWhile(EBool(true), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""Evaluation""")).setId(30739), ILet(Id("""stmtResult"""), ERef(RefId(Id("""__x0__""")))).setId(30740), IApp(Id("""__x1__"""), ERef(RefId(Id("""LoopContinues"""))), List(ERef(RefId(Id("""stmtResult"""))), ERef(RefId(Id("""labelSet"""))))).setId(30742), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""stmtResult"""))), ERef(RefId(Id("""V"""))))).setId(30743), IApp(Id("""__x3__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(30744), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(30745), IReturn(ERef(RefId(Id("""__x4__""")))).setId(30746))).setId(30788), ISeq(List()).setId(30789)).setId(30749), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value"""))), ERef(RefId(Id("""CONST_empty"""))))), IAssign(RefId(Id("""V""")), ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value""")))).setId(30751), ISeq(List()).setId(30792)).setId(30753), IAccess(Id("""__x5__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(30756), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x5__""")))).setId(30757), IApp(Id("""__x6__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))).setId(30759), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(30760), IReturn(ERef(RefId(Id("""__x6__""")))).setId(30761)).setId(30762), ISeq(List()).setId(30800)).setId(30763), ILet(Id("""exprValue"""), ERef(RefId(Id("""__x6__""")))).setId(30764), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""exprValue"""))))).setId(30766), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(30767), IReturn(ERef(RefId(Id("""__x7__""")))).setId(30768)).setId(30769), ISeq(List()).setId(30807)).setId(30770), IIf(EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""V"""))))).setId(30771), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(30772), IReturn(ERef(RefId(Id("""__x9__""")))).setId(30773))).setId(30812), ISeq(List()).setId(30813)).setId(30775))).setId(30815)).setId(30778))).setId(30817))
  val instToStepMap: Map[Int, Int] = HashMap(30758 -> 10, 30766 -> 10, 30749 -> 10, 30744 -> 4, 30752 -> 6, 30772 -> 10, 30764 -> 10, 30736 -> 0, 30751 -> 6, 30774 -> 10, 30742 -> 10, 30763 -> 10, 30745 -> 4, 30743 -> 4, 30775 -> 10, 30754 -> 10, 30747 -> 4, 30739 -> 10, 30771 -> 10, 30759 -> 10, 30778 -> 10, 30776 -> 10, 30765 -> 10, 30740 -> 10, 30741 -> 10, 30777 -> 10, 30737 -> 0, 30773 -> 10, 30746 -> 4, 30756 -> 10, 30757 -> 10, 30770 -> 10, 30753 -> 10, 30750 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(30737, 30736), 5 -> HashSet(30749, 30742, 30750), 10 -> HashSet(30758, 30775, 30754, 30766, 30749, 30772, 30773, 30764, 30756, 30774, 30742, 30763, 30739, 30771, 30759, 30778, 30776, 30765, 30740, 30741, 30777, 30757, 30770, 30753, 30750), 6 -> HashSet(30752, 30751), 9 -> HashSet(30759, 30765, 30764, 30763), 7 -> HashSet(30754, 30753), 3 -> HashSet(30739, 30740, 30741), 8 -> HashSet(30758, 30756, 30757), 4 -> HashSet(30743, 30747, 30744, 30746, 30745))
  /* Beautified form:
  "IterationStatement0LabelledEvaluation0" (this, Statement, Expression, labelSet) => {
    let V = undefined
    while true {
      access __x0__ = (Statement "Evaluation")
      let stmtResult = __x0__
      app __x1__ = (LoopContinues stmtResult labelSet)
      if (= __x1__ false) {
        app __x2__ = (UpdateEmpty stmtResult V)
        app __x3__ = (Completion __x2__)
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
      if (! (= stmtResult["Value"] CONST_empty)) V = stmtResult["Value"] else {}
      access __x5__ = (Expression "Evaluation")
      let exprRef = __x5__
      app __x6__ = (GetValue exprRef)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let exprValue = __x6__
      app __x7__ = (ToBoolean exprValue)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      if (= __x7__ false) {
        app __x8__ = (NormalCompletion V)
        app __x9__ = (WrapCompletion __x8__)
        return __x9__
      } else {}
    }
  }
  */
}
