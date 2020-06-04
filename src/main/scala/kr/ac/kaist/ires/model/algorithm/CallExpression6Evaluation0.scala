package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression6Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression6Evaluation0""", List(Id("""this"""), Id("""CallExpression"""), Id("""TemplateLiteral""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CallExpression"""))), EStr("""Evaluation""")).setId(18575), ILet(Id("""tagRef"""), ERef(RefId(Id("""__x0__""")))).setId(18576), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""tagRef"""))))).setId(18578), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(18579), IReturn(ERef(RefId(Id("""__x1__""")))).setId(18580)).setId(18581), ISeq(List()).setId(18582)).setId(18583), ILet(Id("""tagFunc"""), ERef(RefId(Id("""__x1__""")))).setId(18584), ILet(Id("""thisCall"""), ERef(RefId(Id("""this""")))).setId(18586), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsInTailPosition"""))), List(ERef(RefId(Id("""thisCall"""))))).setId(18588), ILet(Id("""tailCall"""), ERef(RefId(Id("""__x2__""")))).setId(18589), IApp(Id("""__x3__"""), ERef(RefId(Id("""EvaluateCall"""))), List(ERef(RefId(Id("""tagFunc"""))), ERef(RefId(Id("""tagRef"""))), ERef(RefId(Id("""TemplateLiteral"""))), ERef(RefId(Id("""tailCall"""))))).setId(18591), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(18592), IReturn(ERef(RefId(Id("""__x3__""")))).setId(18593)).setId(18594), ISeq(List()).setId(18582)).setId(18595), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(18596), IReturn(ERef(RefId(Id("""__x4__""")))).setId(18597))).setId(-1))
  /* Beautified form:
  "CallExpression6Evaluation0" (this, CallExpression, TemplateLiteral) => {
    access __x0__ = (CallExpression "Evaluation")
    let tagRef = __x0__
    app __x1__ = (GetValue tagRef)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let tagFunc = __x1__
    let thisCall = this
    app __x2__ = (IsInTailPosition thisCall)
    let tailCall = __x2__
    app __x3__ = (EvaluateCall tagFunc tagRef TemplateLiteral tailCall)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
