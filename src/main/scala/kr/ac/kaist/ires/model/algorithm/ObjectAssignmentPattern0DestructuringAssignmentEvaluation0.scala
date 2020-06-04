package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectAssignmentPattern0DestructuringAssignmentEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ObjectAssignmentPattern0DestructuringAssignmentEvaluation0""", List(Id("""this"""), Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""value"""))))).setId(23497), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(23498), IReturn(ERef(RefId(Id("""__x0__""")))).setId(23499)).setId(23500), ISeq(List()).setId(23501)).setId(23502), IExpr(ERef(RefId(Id("""__x0__""")))).setId(23503), IApp(Id("""__x1__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(23505), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(23506), IReturn(ERef(RefId(Id("""__x2__""")))).setId(23507))).setId(-1))
  /* Beautified form:
  "ObjectAssignmentPattern0DestructuringAssignmentEvaluation0" (this, value) => {
    app __x0__ = (RequireObjectCoercible value)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (NormalCompletion CONST_empty)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
