package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object VariableStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""VariableStatement0Evaluation0""", List(Id("""this"""), Id("""VariableDeclarationList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""VariableDeclarationList"""))), EStr("""Evaluation""")).setId(27525), ILet(Id("""next"""), ERef(RefId(Id("""__x0__""")))).setId(27526), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(27528), IReturn(ERef(RefId(Id("""next""")))).setId(27529)).setId(27530), ISeq(List()).setId(27531)).setId(27532), IExpr(ERef(RefId(Id("""next""")))).setId(27533), IApp(Id("""__x1__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(27535), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(27536), IReturn(ERef(RefId(Id("""__x2__""")))).setId(27537))).setId(-1))
  /* Beautified form:
  "VariableStatement0Evaluation0" (this, VariableDeclarationList) => {
    access __x0__ = (VariableDeclarationList "Evaluation")
    let next = __x0__
    if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
    next
    app __x1__ = (NormalCompletion CONST_empty)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
