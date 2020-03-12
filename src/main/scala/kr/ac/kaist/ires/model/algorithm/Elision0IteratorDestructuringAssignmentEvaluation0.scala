package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Elision0IteratorDestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""Elision0IteratorDestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""iteratorRecord""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(24727), ILet(Id("""next"""), ERef(RefId(Id("""__x0__""")))).setId(24728), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(24730), IIf(ERef(RefId(Id("""__x1__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(24731), ISeq(List()).setId(24758)).setId(24734), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(24736), IReturn(ERef(RefId(Id("""next""")))).setId(24737)).setId(24738), ISeq(List()).setId(24763)).setId(24739), IExpr(ERef(RefId(Id("""next""")))).setId(24740), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(24742), ISeq(List()).setId(24767)).setId(24744))).setId(24769), ISeq(List()).setId(24770)).setId(24747), IApp(Id("""__x2__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(24749), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(24750), IReturn(ERef(RefId(Id("""__x3__""")))).setId(24751))).setId(24775))
  val instToStepMap: Map[Int, Int] = HashMap(24740 -> 6, 24734 -> 6, 24751 -> 8, 24739 -> 6, 24743 -> 6, 24742 -> 6, 24749 -> 8, 24746 -> 6, 24729 -> 6, 24741 -> 6, 24750 -> 8, 24728 -> 6, 24747 -> 7, 24730 -> 6, 24744 -> 6, 24727 -> 6, 24731 -> 3, 24748 -> 7, 24732 -> 3, 24745 -> 6, 24735 -> 6, 24752 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(5 -> HashSet(24740, 24739, 24741), 6 -> HashSet(24730, 24740, 24734, 24739, 24743, 24745, 24742, 24735, 24746, 24729, 24741, 24728, 24744, 24727), 2 -> HashSet(24727, 24729, 24728), 7 -> HashSet(24747, 24748), 3 -> HashSet(24731, 24732), 8 -> HashSet(24751, 24752, 24749, 24750), 4 -> HashSet(24730, 24734, 24735))
  /* Beautified form:
  "Elision0IteratorDestructuringAssignmentEvaluation0" (this, iteratorRecord) => {
    if (= iteratorRecord["Done"] false) {
      app __x0__ = (IteratorStep iteratorRecord)
      let next = __x0__
      app __x1__ = (IsAbruptCompletion next)
      if __x1__ iteratorRecord["Done"] = true else {}
      if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) iteratorRecord["Done"] = true else {}
    } else {}
    app __x2__ = (NormalCompletion CONST_empty)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
