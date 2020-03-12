package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Elision1IteratorDestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""Elision1IteratorDestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""Elision"""), Id("""iteratorRecord""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Elision"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(24798), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(24799), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(24800), IReturn(ERef(RefId(Id("""__x1__""")))).setId(24801)).setId(24802), ISeq(List()).setId(24838)).setId(24804), IExpr(ERef(RefId(Id("""__x1__""")))).setId(24805), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(24807), ILet(Id("""next"""), ERef(RefId(Id("""__x2__""")))).setId(24808), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(24810), IIf(ERef(RefId(Id("""__x3__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(24811), ISeq(List()).setId(24845)).setId(24813), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(24815), IReturn(ERef(RefId(Id("""next""")))).setId(24816)).setId(24817), ISeq(List()).setId(24850)).setId(24818), IExpr(ERef(RefId(Id("""next""")))).setId(24819), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(24821), ISeq(List()).setId(24854)).setId(24823))).setId(24856), ISeq(List()).setId(24857)).setId(24826), IApp(Id("""__x4__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(24828), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(24829), IReturn(ERef(RefId(Id("""__x5__""")))).setId(24830))).setId(24862))
  val instToStepMap: Map[Int, Int] = HashMap(24804 -> 0, 24798 -> 0, 24811 -> 4, 24808 -> 7, 24812 -> 4, 24807 -> 7, 24813 -> 7, 24799 -> 0, 24806 -> 0, 24809 -> 7, 24814 -> 7, 24805 -> 0, 24810 -> 7, 24830 -> 9, 24819 -> 7, 24826 -> 8, 24823 -> 7, 24818 -> 7, 24831 -> 9, 24822 -> 7, 24827 -> 8, 24828 -> 9, 24821 -> 7, 24820 -> 7, 24829 -> 9, 24824 -> 7, 24825 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(24804, 24798, 24799, 24806, 24805), 5 -> HashSet(24813, 24814, 24810), 6 -> HashSet(24819, 24818, 24820), 9 -> HashSet(24830, 24831, 24828, 24829), 7 -> HashSet(24819, 24823, 24808, 24818, 24822, 24807, 24813, 24809, 24821, 24814, 24820, 24810, 24824, 24825), 3 -> HashSet(24808, 24807, 24809), 8 -> HashSet(24826, 24827), 4 -> HashSet(24811, 24812))
  /* Beautified form:
  "Elision1IteratorDestructuringAssignmentEvaluation0" (this, Elision, iteratorRecord) => {
    access __x0__ = (Elision "IteratorDestructuringAssignmentEvaluation")
    app __x1__ = (__x0__ iteratorRecord)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    if (= iteratorRecord["Done"] false) {
      app __x2__ = (IteratorStep iteratorRecord)
      let next = __x2__
      app __x3__ = (IsAbruptCompletion next)
      if __x3__ iteratorRecord["Done"] = true else {}
      if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) iteratorRecord["Done"] = true else {}
    } else {}
    app __x4__ = (NormalCompletion CONST_empty)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
