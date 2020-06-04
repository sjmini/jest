package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement3LabelledEvaluation3 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement3LabelledEvaluation3""", List(Id("""this"""), Id("""VariableDeclarationList"""), Id("""Expression0"""), Id("""Expression1"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""VariableDeclarationList"""))), EStr("""Evaluation""")).setId(31222), ILet(Id("""varDcl"""), ERef(RefId(Id("""__x0__""")))).setId(31223), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""varDcl""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""varDcl""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""varDcl""")), ERef(RefProp(RefId(Id("""varDcl""")), EStr("""Value""")))).setId(31225), IReturn(ERef(RefId(Id("""varDcl""")))).setId(31226)).setId(31227), ISeq(List()).setId(31228)).setId(31229), IExpr(ERef(RefId(Id("""varDcl""")))).setId(31230), IApp(Id("""__x1__"""), ERef(RefId(Id("""ForBodyEvaluation"""))), List(ERef(RefId(Id("""Expression0"""))), ERef(RefId(Id("""Expression1"""))), ERef(RefId(Id("""Statement"""))), EList(List()), ERef(RefId(Id("""labelSet"""))))).setId(31232), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(31233), IReturn(ERef(RefId(Id("""__x1__""")))).setId(31234)).setId(31235), ISeq(List()).setId(31228)).setId(31236), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(31237), IReturn(ERef(RefId(Id("""__x2__""")))).setId(31238))).setId(-1))
  /* Beautified form:
  "IterationStatement3LabelledEvaluation3" (this, VariableDeclarationList, Expression0, Expression1, Statement, labelSet) => {
    access __x0__ = (VariableDeclarationList "Evaluation")
    let varDcl = __x0__
    if (= (typeof varDcl) "Completion") if (= varDcl["Type"] CONST_normal) varDcl = varDcl["Value"] else return varDcl else {}
    varDcl
    app __x1__ = (ForBodyEvaluation Expression0 Expression1 Statement (new []) labelSet)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
