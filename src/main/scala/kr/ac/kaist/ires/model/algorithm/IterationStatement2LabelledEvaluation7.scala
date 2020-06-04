package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement2LabelledEvaluation7 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement2LabelledEvaluation7""", List(Id("""this"""), Id("""Expression0"""), Id("""Expression1"""), Id("""Expression2"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Expression0"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression0"""))), EStr("""Evaluation""")).setId(31156), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x0__""")))).setId(31157), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))).setId(31159), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(31160), IReturn(ERef(RefId(Id("""__x1__""")))).setId(31161)).setId(31162), ISeq(List()).setId(31163)).setId(31164), IExpr(ERef(RefId(Id("""__x1__""")))).setId(31165))).setId(31167), ISeq(List()).setId(31163)).setId(31168), IApp(Id("""__x2__"""), ERef(RefId(Id("""ForBodyEvaluation"""))), List(ERef(RefId(Id("""Expression1"""))), ERef(RefId(Id("""Expression2"""))), ERef(RefId(Id("""Statement"""))), EList(List()), ERef(RefId(Id("""labelSet"""))))).setId(31170), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(31171), IReturn(ERef(RefId(Id("""__x2__""")))).setId(31172)).setId(31173), ISeq(List()).setId(31163)).setId(31174), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(31175), IReturn(ERef(RefId(Id("""__x3__""")))).setId(31176))).setId(-1))
  /* Beautified form:
  "IterationStatement2LabelledEvaluation7" (this, Expression0, Expression1, Expression2, Statement, labelSet) => {
    if (! (= Expression0 absent)) {
      access __x0__ = (Expression0 "Evaluation")
      let exprRef = __x0__
      app __x1__ = (GetValue exprRef)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      __x1__
    } else {}
    app __x2__ = (ForBodyEvaluation Expression1 Expression2 Statement (new []) labelSet)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
