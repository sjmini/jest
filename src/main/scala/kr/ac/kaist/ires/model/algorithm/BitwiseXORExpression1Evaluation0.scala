package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BitwiseXORExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""BitwiseXORExpression1Evaluation0""", List(Id("""this"""), Id("""A"""), Id("""B""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""A"""))), EStr("""Evaluation""")).setId(22051), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(22052), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(22054), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(22055), IReturn(ERef(RefId(Id("""__x1__""")))).setId(22056)).setId(22057), ISeq(List()).setId(22058)).setId(22059), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(22060), IAccess(Id("""__x2__"""), ERef(RefId(Id("""B"""))), EStr("""Evaluation""")).setId(22063), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(22064), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(22066), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(22067), IReturn(ERef(RefId(Id("""__x3__""")))).setId(22068)).setId(22069), ISeq(List()).setId(22058)).setId(22070), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(22071), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""lval"""))))).setId(22073), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(22074), IReturn(ERef(RefId(Id("""__x4__""")))).setId(22075)).setId(22076), ISeq(List()).setId(22058)).setId(22077), ILet(Id("""lnum"""), ERef(RefId(Id("""__x4__""")))).setId(22078), IApp(Id("""__x5__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""rval"""))))).setId(22080), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(22081), IReturn(ERef(RefId(Id("""__x5__""")))).setId(22082)).setId(22083), ISeq(List()).setId(22058)).setId(22084), ILet(Id("""rnum"""), ERef(RefId(Id("""__x5__""")))).setId(22085), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OBXOr, ERef(RefId(Id("""lnum"""))), ERef(RefId(Id("""rnum""")))))).setId(22087), IReturn(ERef(RefId(Id("""__x6__""")))).setId(22088))).setId(-1))
  /* Beautified form:
  "BitwiseXORExpression1Evaluation0" (this, A, B) => {
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
    app __x6__ = (WrapCompletion (^ lnum rnum))
    return __x6__
  }
  */
}
