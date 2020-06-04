package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LogicalANDExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""LogicalANDExpression1Evaluation0""", List(Id("""this"""), Id("""LogicalANDExpression"""), Id("""BitwiseORExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LogicalANDExpression"""))), EStr("""Evaluation""")).setId(22293), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(22294), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(22296), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(22297), IReturn(ERef(RefId(Id("""__x1__""")))).setId(22298)).setId(22299), ISeq(List()).setId(22300)).setId(22301), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(22302), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""lval"""))))).setId(22304), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(22305), IReturn(ERef(RefId(Id("""__x2__""")))).setId(22306)).setId(22307), ISeq(List()).setId(22300)).setId(22308), ILet(Id("""lbool"""), ERef(RefId(Id("""__x2__""")))).setId(22309), IIf(EBOp(OEq, ERef(RefId(Id("""lbool"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""lval"""))))).setId(22311), IReturn(ERef(RefId(Id("""__x3__""")))).setId(22312))).setId(22313), ISeq(List()).setId(22300)).setId(22314), IAccess(Id("""__x4__"""), ERef(RefId(Id("""BitwiseORExpression"""))), EStr("""Evaluation""")).setId(22317), ILet(Id("""rref"""), ERef(RefId(Id("""__x4__""")))).setId(22318), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(22320), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(22321), IReturn(ERef(RefId(Id("""__x5__""")))).setId(22322)).setId(22323), ISeq(List()).setId(22300)).setId(22324), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(22325), IReturn(ERef(RefId(Id("""__x6__""")))).setId(22326))).setId(-1))
  /* Beautified form:
  "LogicalANDExpression1Evaluation0" (this, LogicalANDExpression, BitwiseORExpression) => {
    access __x0__ = (LogicalANDExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    app __x2__ = (ToBoolean lval)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let lbool = __x2__
    if (= lbool false) {
      app __x3__ = (WrapCompletion lval)
      return __x3__
    } else {}
    access __x4__ = (BitwiseORExpression "Evaluation")
    let rref = __x4__
    app __x5__ = (GetValue rref)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
