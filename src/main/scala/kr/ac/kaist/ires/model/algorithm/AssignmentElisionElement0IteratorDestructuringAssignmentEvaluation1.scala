package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentElisionElement0IteratorDestructuringAssignmentEvaluation1 {
  val length: Int = 0
  val func: Func = Func("""AssignmentElisionElement0IteratorDestructuringAssignmentEvaluation1""", List(Id("""this"""), Id("""Elision"""), Id("""AssignmentElement"""), Id("""iteratorRecord""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Elision"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(24686), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(24687), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(24688), IReturn(ERef(RefId(Id("""__x1__""")))).setId(24689)).setId(24690), ISeq(List()).setId(24691)).setId(24692), IExpr(ERef(RefId(Id("""__x1__""")))).setId(24693), IAccess(Id("""__x2__"""), ERef(RefId(Id("""AssignmentElement"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(24695), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(24696), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(24697), IReturn(ERef(RefId(Id("""__x4__""")))).setId(24698))).setId(-1))
  /* Beautified form:
  "AssignmentElisionElement0IteratorDestructuringAssignmentEvaluation1" (this, Elision, AssignmentElement, iteratorRecord) => {
    access __x0__ = (Elision "IteratorDestructuringAssignmentEvaluation")
    app __x1__ = (__x0__ iteratorRecord)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    access __x2__ = (AssignmentElement "IteratorDestructuringAssignmentEvaluation")
    app __x3__ = (__x2__ iteratorRecord)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
