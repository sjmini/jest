package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LogicalORExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""LogicalORExpression1Evaluation0""", List(Id("""this"""), Id("""LogicalORExpression"""), Id("""LogicalANDExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LogicalORExpression"""))), EStr("""Evaluation""")).setId(22394), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(22395), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(22397), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(22398), IReturn(ERef(RefId(Id("""__x1__""")))).setId(22399)).setId(22400), ISeq(List()).setId(22401)).setId(22402), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(22403), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""lval"""))))).setId(22405), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(22406), IReturn(ERef(RefId(Id("""__x2__""")))).setId(22407)).setId(22408), ISeq(List()).setId(22401)).setId(22409), ILet(Id("""lbool"""), ERef(RefId(Id("""__x2__""")))).setId(22410), IIf(EBOp(OEq, ERef(RefId(Id("""lbool"""))), EBool(true)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""lval"""))))).setId(22412), IReturn(ERef(RefId(Id("""__x3__""")))).setId(22413))).setId(22414), ISeq(List()).setId(22401)).setId(22415), IAccess(Id("""__x4__"""), ERef(RefId(Id("""LogicalANDExpression"""))), EStr("""Evaluation""")).setId(22418), ILet(Id("""rref"""), ERef(RefId(Id("""__x4__""")))).setId(22419), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(22421), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(22422), IReturn(ERef(RefId(Id("""__x5__""")))).setId(22423)).setId(22424), ISeq(List()).setId(22401)).setId(22425), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(22426), IReturn(ERef(RefId(Id("""__x6__""")))).setId(22427))).setId(-1))
  /* Beautified form:
  "LogicalORExpression1Evaluation0" (this, LogicalORExpression, LogicalANDExpression) => {
    access __x0__ = (LogicalORExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    app __x2__ = (ToBoolean lval)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let lbool = __x2__
    if (= lbool true) {
      app __x3__ = (WrapCompletion lval)
      return __x3__
    } else {}
    access __x4__ = (LogicalANDExpression "Evaluation")
    let rref = __x4__
    app __x5__ = (GetValue rref)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
