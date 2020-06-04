package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MultiplicativeExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""MultiplicativeExpression1Evaluation0""", List(Id("""this"""), Id("""MultiplicativeExpression"""), Id("""MultiplicativeOperator"""), Id("""ExponentiationExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""MultiplicativeExpression"""))), EStr("""Evaluation""")).setId(19841), ILet(Id("""left"""), ERef(RefId(Id("""__x0__""")))).setId(19842), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""left"""))))).setId(19844), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(19845), IReturn(ERef(RefId(Id("""__x1__""")))).setId(19846)).setId(19847), ISeq(List()).setId(19848)).setId(19849), ILet(Id("""leftValue"""), ERef(RefId(Id("""__x1__""")))).setId(19850), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ExponentiationExpression"""))), EStr("""Evaluation""")).setId(19853), ILet(Id("""right"""), ERef(RefId(Id("""__x2__""")))).setId(19854), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""right"""))))).setId(19856), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(19857), IReturn(ERef(RefId(Id("""__x3__""")))).setId(19858)).setId(19859), ISeq(List()).setId(19848)).setId(19860), ILet(Id("""rightValue"""), ERef(RefId(Id("""__x3__""")))).setId(19861), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""leftValue"""))))).setId(19863), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(19864), IReturn(ERef(RefId(Id("""__x4__""")))).setId(19865)).setId(19866), ISeq(List()).setId(19848)).setId(19867), ILet(Id("""lnum"""), ERef(RefId(Id("""__x4__""")))).setId(19868), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""rightValue"""))))).setId(19870), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(19871), IReturn(ERef(RefId(Id("""__x5__""")))).setId(19872)).setId(19873), ISeq(List()).setId(19848)).setId(19874), ILet(Id("""rnum"""), ERef(RefId(Id("""__x5__""")))).setId(19875), IApp(Id("""__x6__"""), ERef(RefId(Id("""MulOperation"""))), List(EGetSyntax(ERef(RefId(Id("""MultiplicativeOperator""")))), ERef(RefId(Id("""lnum"""))), ERef(RefId(Id("""rnum"""))))).setId(19877), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(19878), IReturn(ERef(RefId(Id("""__x7__""")))).setId(19879))).setId(-1))
  /* Beautified form:
  "MultiplicativeExpression1Evaluation0" (this, MultiplicativeExpression, MultiplicativeOperator, ExponentiationExpression) => {
    access __x0__ = (MultiplicativeExpression "Evaluation")
    let left = __x0__
    app __x1__ = (GetValue left)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let leftValue = __x1__
    access __x2__ = (ExponentiationExpression "Evaluation")
    let right = __x2__
    app __x3__ = (GetValue right)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rightValue = __x3__
    app __x4__ = (ToNumber leftValue)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let lnum = __x4__
    app __x5__ = (ToNumber rightValue)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let rnum = __x5__
    app __x6__ = (MulOperation (get-syntax MultiplicativeOperator) lnum rnum)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
