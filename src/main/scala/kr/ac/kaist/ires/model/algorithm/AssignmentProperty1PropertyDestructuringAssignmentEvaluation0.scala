package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentProperty1PropertyDestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentProperty1PropertyDestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""PropertyName"""), Id("""AssignmentElement"""), Id("""value""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""Evaluation""")).setId(24485), ILet(Id("""name"""), ERef(RefId(Id("""__x0__""")))).setId(24486), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""name""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""name""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""name""")), ERef(RefProp(RefId(Id("""name""")), EStr("""Value""")))).setId(24488), IReturn(ERef(RefId(Id("""name""")))).setId(24489)).setId(24490), ISeq(List()).setId(24491)).setId(24492), IExpr(ERef(RefId(Id("""name""")))).setId(24493), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentElement"""))), EStr("""KeyedDestructuringAssignmentEvaluation""")).setId(24495), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""name"""))))).setId(24496), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(24497), IReturn(ERef(RefId(Id("""__x2__""")))).setId(24498)).setId(24499), ISeq(List()).setId(24491)).setId(24500), IExpr(ERef(RefId(Id("""__x2__""")))).setId(24501), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List(ERef(RefId(Id("""name"""))))))).setId(24503), IReturn(ERef(RefId(Id("""__x3__""")))).setId(24504))).setId(-1))
  /* Beautified form:
  "AssignmentProperty1PropertyDestructuringAssignmentEvaluation0" (this, PropertyName, AssignmentElement, value) => {
    access __x0__ = (PropertyName "Evaluation")
    let name = __x0__
    if (= (typeof name) "Completion") if (= name["Type"] CONST_normal) name = name["Value"] else return name else {}
    name
    access __x1__ = (AssignmentElement "KeyedDestructuringAssignmentEvaluation")
    app __x2__ = (__x1__ value name)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (WrapCompletion (new [name]))
    return __x3__
  }
  */
}
