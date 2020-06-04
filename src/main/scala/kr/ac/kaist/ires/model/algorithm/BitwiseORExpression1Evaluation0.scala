package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BitwiseORExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""BitwiseORExpression1Evaluation0""", List(Id("""this"""), Id("""A"""), Id("""B""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""A"""))), EStr("""Evaluation""")).setId(22162), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(22163), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(22165), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(22166), IReturn(ERef(RefId(Id("""__x1__""")))).setId(22167)).setId(22168), ISeq(List()).setId(22169)).setId(22170), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(22171), IAccess(Id("""__x2__"""), ERef(RefId(Id("""B"""))), EStr("""Evaluation""")).setId(22174), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(22175), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(22177), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(22178), IReturn(ERef(RefId(Id("""__x3__""")))).setId(22179)).setId(22180), ISeq(List()).setId(22169)).setId(22181), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(22182), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""lval"""))))).setId(22184), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(22185), IReturn(ERef(RefId(Id("""__x4__""")))).setId(22186)).setId(22187), ISeq(List()).setId(22169)).setId(22188), ILet(Id("""lnum"""), ERef(RefId(Id("""__x4__""")))).setId(22189), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""rval"""))))).setId(22191), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(22192), IReturn(ERef(RefId(Id("""__x5__""")))).setId(22193)).setId(22194), ISeq(List()).setId(22169)).setId(22195), ILet(Id("""rnum"""), ERef(RefId(Id("""__x5__""")))).setId(22196), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OBOr, ERef(RefId(Id("""lnum"""))), ERef(RefId(Id("""rnum""")))))).setId(22198), IReturn(ERef(RefId(Id("""__x6__""")))).setId(22199))).setId(-1))
  /* Beautified form:
  "BitwiseORExpression1Evaluation0" (this, A, B) => {
    access __x0__ = (A "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (B "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    app __x4__ = (ToInt32 lval)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let lnum = __x4__
    app __x5__ = (ToInt32 rval)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let rnum = __x5__
    app __x6__ = (WrapCompletion (| lnum rnum))
    return __x6__
  }
  */
}
