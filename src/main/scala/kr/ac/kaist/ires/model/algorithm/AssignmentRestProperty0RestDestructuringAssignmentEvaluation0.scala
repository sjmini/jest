package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentRestProperty0RestDestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentRestProperty0RestDestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""DestructuringAssignmentTarget"""), Id("""value"""), Id("""excludedNames""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""DestructuringAssignmentTarget"""))), EStr("""Evaluation""")).setId(24546), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(24547), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""lref""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""lref""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""lref""")), ERef(RefProp(RefId(Id("""lref""")), EStr("""Value""")))).setId(24549), IReturn(ERef(RefId(Id("""lref""")))).setId(24550)).setId(24551), ISeq(List()).setId(24552)).setId(24553), IExpr(ERef(RefId(Id("""lref""")))).setId(24554), IApp(Id("""__x1__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))))).setId(24556), ILet(Id("""restObj"""), ERef(RefId(Id("""__x1__""")))).setId(24557), IApp(Id("""__x2__"""), ERef(RefId(Id("""CopyDataProperties"""))), List(ERef(RefId(Id("""restObj"""))), ERef(RefId(Id("""value"""))), ERef(RefId(Id("""excludedNames"""))))).setId(24559), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(24560), IReturn(ERef(RefId(Id("""__x2__""")))).setId(24561)).setId(24562), ISeq(List()).setId(24552)).setId(24563), IExpr(ERef(RefId(Id("""__x2__""")))).setId(24564), IApp(Id("""__x3__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lref"""))), ERef(RefId(Id("""restObj"""))))).setId(24566), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(24567), IReturn(ERef(RefId(Id("""__x4__""")))).setId(24568))).setId(-1))
  /* Beautified form:
  "AssignmentRestProperty0RestDestructuringAssignmentEvaluation0" (this, DestructuringAssignmentTarget, value, excludedNames) => {
    access __x0__ = (DestructuringAssignmentTarget "Evaluation")
    let lref = __x0__
    if (= (typeof lref) "Completion") if (= lref["Type"] CONST_normal) lref = lref["Value"] else return lref else {}
    lref
    app __x1__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    let restObj = __x1__
    app __x2__ = (CopyDataProperties restObj value excludedNames)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (PutValue lref restObj)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
