package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentElementList1IteratorDestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentElementList1IteratorDestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""AssignmentElementList"""), Id("""AssignmentElisionElement"""), Id("""iteratorRecord""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AssignmentElementList"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(24629), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(24630), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(24631), IReturn(ERef(RefId(Id("""__x1__""")))).setId(24632)).setId(24633), ISeq(List()).setId(24634)).setId(24635), IExpr(ERef(RefId(Id("""__x1__""")))).setId(24636), IAccess(Id("""__x2__"""), ERef(RefId(Id("""AssignmentElisionElement"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(24638), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(24639), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(24640), IReturn(ERef(RefId(Id("""__x4__""")))).setId(24641))).setId(-1))
  /* Beautified form:
  "AssignmentElementList1IteratorDestructuringAssignmentEvaluation0" (this, AssignmentElementList, AssignmentElisionElement, iteratorRecord) => {
    access __x0__ = (AssignmentElementList "IteratorDestructuringAssignmentEvaluation")
    app __x1__ = (__x0__ iteratorRecord)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    access __x2__ = (AssignmentElisionElement "IteratorDestructuringAssignmentEvaluation")
    app __x3__ = (__x2__ iteratorRecord)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
