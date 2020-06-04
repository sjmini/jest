package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectAssignmentPattern3DestructuringAssignmentEvaluation1 {
  val length: Int = 0
  val func: Func = Func("""ObjectAssignmentPattern3DestructuringAssignmentEvaluation1""", List(Id("""this"""), Id("""AssignmentPropertyList"""), Id("""AssignmentRestProperty"""), Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""value"""))))).setId(24198), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(24199), IReturn(ERef(RefId(Id("""__x0__""")))).setId(24200)).setId(24201), ISeq(List()).setId(24202)).setId(24203), IExpr(ERef(RefId(Id("""__x0__""")))).setId(24204), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentPropertyList"""))), EStr("""PropertyDestructuringAssignmentEvaluation""")).setId(24206), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""value"""))))).setId(24207), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(24208), IReturn(ERef(RefId(Id("""__x2__""")))).setId(24209)).setId(24210), ISeq(List()).setId(24202)).setId(24211), ILet(Id("""excludedNames"""), ERef(RefId(Id("""__x2__""")))).setId(24212), IAccess(Id("""__x3__"""), ERef(RefId(Id("""AssignmentRestProperty"""))), EStr("""RestDestructuringAssignmentEvaluation""")).setId(24214), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""excludedNames"""))))).setId(24215), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(24216), IReturn(ERef(RefId(Id("""__x5__""")))).setId(24217))).setId(-1))
  /* Beautified form:
  "ObjectAssignmentPattern3DestructuringAssignmentEvaluation1" (this, AssignmentPropertyList, AssignmentRestProperty, value) => {
    app __x0__ = (RequireObjectCoercible value)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    access __x1__ = (AssignmentPropertyList "PropertyDestructuringAssignmentEvaluation")
    app __x2__ = (__x1__ value)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let excludedNames = __x2__
    access __x3__ = (AssignmentRestProperty "RestDestructuringAssignmentEvaluation")
    app __x4__ = (__x3__ value excludedNames)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
