package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ExponentiationExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ExponentiationExpression1Evaluation0""", List(Id("""this"""), Id("""UpdateExpression"""), Id("""ExponentiationExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UpdateExpression"""))), EStr("""Evaluation""")).setId(19720), ILet(Id("""left"""), ERef(RefId(Id("""__x0__""")))).setId(19721), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""left"""))))).setId(19723), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(19724), IReturn(ERef(RefId(Id("""__x1__""")))).setId(19725)).setId(19726), ISeq(List()).setId(19727)).setId(19728), ILet(Id("""leftValue"""), ERef(RefId(Id("""__x1__""")))).setId(19729), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ExponentiationExpression"""))), EStr("""Evaluation""")).setId(19732), ILet(Id("""right"""), ERef(RefId(Id("""__x2__""")))).setId(19733), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""right"""))))).setId(19735), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(19736), IReturn(ERef(RefId(Id("""__x3__""")))).setId(19737)).setId(19738), ISeq(List()).setId(19727)).setId(19739), ILet(Id("""rightValue"""), ERef(RefId(Id("""__x3__""")))).setId(19740), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""leftValue"""))))).setId(19742), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(19743), IReturn(ERef(RefId(Id("""__x4__""")))).setId(19744)).setId(19745), ISeq(List()).setId(19727)).setId(19746), ILet(Id("""base"""), ERef(RefId(Id("""__x4__""")))).setId(19747), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""rightValue"""))))).setId(19749), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(19750), IReturn(ERef(RefId(Id("""__x5__""")))).setId(19751)).setId(19752), ISeq(List()).setId(19727)).setId(19753), ILet(Id("""exponent"""), ERef(RefId(Id("""__x5__""")))).setId(19754), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPow, ERef(RefId(Id("""base"""))), ERef(RefId(Id("""exponent""")))))).setId(19756), IReturn(ERef(RefId(Id("""__x6__""")))).setId(19757))).setId(-1))
  /* Beautified form:
  "ExponentiationExpression1Evaluation0" (this, UpdateExpression, ExponentiationExpression) => {
    access __x0__ = (UpdateExpression "Evaluation")
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
    let base = __x4__
    app __x5__ = (ToNumber rightValue)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let exponent = __x5__
    app __x6__ = (WrapCompletion (** base exponent))
    return __x6__
  }
  */
}
