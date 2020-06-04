package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UpdateExpression2Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""UpdateExpression2Evaluation0""", List(Id("""this"""), Id("""LeftHandSideExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LeftHandSideExpression"""))), EStr("""Evaluation""")).setId(18778), ILet(Id("""lhs"""), ERef(RefId(Id("""__x0__""")))).setId(18779), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lhs"""))))).setId(18781), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(18782), IReturn(ERef(RefId(Id("""__x1__""")))).setId(18783)).setId(18784), ISeq(List()).setId(18785)).setId(18786), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(18787), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(18788), IReturn(ERef(RefId(Id("""__x2__""")))).setId(18789)).setId(18790), ISeq(List()).setId(18785)).setId(18791), ILet(Id("""oldValue"""), ERef(RefId(Id("""__x2__""")))).setId(18792), ILet(Id("""newValue"""), EBOp(OSub, ERef(RefId(Id("""oldValue"""))), ENum(1.0))).setId(18794), IApp(Id("""__x3__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""newValue"""))))).setId(18796), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(18797), IReturn(ERef(RefId(Id("""__x3__""")))).setId(18798)).setId(18799), ISeq(List()).setId(18785)).setId(18800), IExpr(ERef(RefId(Id("""__x3__""")))).setId(18801), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""oldValue"""))))).setId(18803), IReturn(ERef(RefId(Id("""__x4__""")))).setId(18804))).setId(-1))
  /* Beautified form:
  "UpdateExpression2Evaluation0" (this, LeftHandSideExpression) => {
    access __x0__ = (LeftHandSideExpression "Evaluation")
    let lhs = __x0__
    app __x1__ = (GetValue lhs)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToNumber __x1__)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let oldValue = __x2__
    let newValue = (- oldValue 1.0)
    app __x3__ = (PutValue lhs newValue)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (WrapCompletion oldValue)
    return __x4__
  }
  */
}
