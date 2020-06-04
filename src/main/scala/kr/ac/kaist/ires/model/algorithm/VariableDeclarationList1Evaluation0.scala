package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object VariableDeclarationList1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""VariableDeclarationList1Evaluation0""", List(Id("""this"""), Id("""VariableDeclarationList"""), Id("""VariableDeclaration""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""VariableDeclarationList"""))), EStr("""Evaluation""")).setId(27565), ILet(Id("""next"""), ERef(RefId(Id("""__x0__""")))).setId(27566), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(27568), IReturn(ERef(RefId(Id("""next""")))).setId(27569)).setId(27570), ISeq(List()).setId(27571)).setId(27572), IExpr(ERef(RefId(Id("""next""")))).setId(27573), IAccess(Id("""__x1__"""), ERef(RefId(Id("""VariableDeclaration"""))), EStr("""Evaluation""")).setId(27576), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(27577), IReturn(ERef(RefId(Id("""__x2__""")))).setId(27578))).setId(-1))
  /* Beautified form:
  "VariableDeclarationList1Evaluation0" (this, VariableDeclarationList, VariableDeclaration) => {
    access __x0__ = (VariableDeclarationList "Evaluation")
    let next = __x0__
    if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
    next
    access __x1__ = (VariableDeclaration "Evaluation")
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
