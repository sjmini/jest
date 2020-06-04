package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object RelationalExpression4Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression4Evaluation0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""RelationalExpression"""))), EStr("""Evaluation""")).setId(21084), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(21085), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(21087), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(21088), IReturn(ERef(RefId(Id("""__x1__""")))).setId(21089)).setId(21090), ISeq(List()).setId(21091)).setId(21092), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(21093), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ShiftExpression"""))), EStr("""Evaluation""")).setId(21096), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(21097), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(21099), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(21100), IReturn(ERef(RefId(Id("""__x3__""")))).setId(21101)).setId(21102), ISeq(List()).setId(21091)).setId(21103), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(21104), IApp(Id("""__x4__"""), ERef(RefId(Id("""AbstractRelationalComparison"""))), List(ERef(RefId(Id("""lval"""))), ERef(RefId(Id("""rval"""))))).setId(21107), ILet(Id("""r"""), ERef(RefId(Id("""__x4__""")))).setId(21108), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""r""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""r""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""r""")), ERef(RefProp(RefId(Id("""r""")), EStr("""Value""")))).setId(21110), IReturn(ERef(RefId(Id("""r""")))).setId(21111)).setId(21112), ISeq(List()).setId(21091)).setId(21113), IExpr(ERef(RefId(Id("""r""")))).setId(21114), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""r"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""r"""))), EUndef)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(21116), IReturn(ERef(RefId(Id("""__x5__""")))).setId(21117))).setId(21118), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(21119), IReturn(ERef(RefId(Id("""__x6__""")))).setId(21120))).setId(21121)).setId(21122))).setId(-1))
  /* Beautified form:
  "RelationalExpression4Evaluation0" (this, RelationalExpression, ShiftExpression) => {
    access __x0__ = (RelationalExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (ShiftExpression "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    app __x4__ = (AbstractRelationalComparison lval rval)
    let r = __x4__
    if (= (typeof r) "Completion") if (= r["Type"] CONST_normal) r = r["Value"] else return r else {}
    r
    if (|| (= r true) (= r undefined)) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {
      app __x6__ = (WrapCompletion true)
      return __x6__
    }
  }
  */
}
