package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement5LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement5LabelledEvaluation0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""Expression"""), Id("""Statement"""), Id("""labelSet""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ForInOfHeadEvaluation"""))), List(EList(List()), ERef(RefId(Id("""Expression"""))), ERef(RefId(Id("""CONST_enumerate"""))))).setId(32650), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(32651), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32652)).setId(32653), ISeq(List()).setId(32654)).setId(32655), ILet(Id("""keyResult"""), ERef(RefId(Id("""__x0__""")))).setId(32656), IApp(Id("""__x1__"""), ERef(RefId(Id("""ForInOfBodyEvaluation"""))), List(ERef(RefId(Id("""LeftHandSideExpression"""))), ERef(RefId(Id("""Statement"""))), ERef(RefId(Id("""keyResult"""))), ERef(RefId(Id("""CONST_enumerate"""))), ERef(RefId(Id("""CONST_assignment"""))), ERef(RefId(Id("""labelSet"""))))).setId(32658), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(32659), IReturn(ERef(RefId(Id("""__x1__""")))).setId(32660)).setId(32661), ISeq(List()).setId(32654)).setId(32662), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(32663), IReturn(ERef(RefId(Id("""__x2__""")))).setId(32664))).setId(-1))
  /* Beautified form:
  "IterationStatement5LabelledEvaluation0" (this, LeftHandSideExpression, Expression, Statement, labelSet) => {
    app __x0__ = (ForInOfHeadEvaluation (new []) Expression CONST_enumerate)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let keyResult = __x0__
    app __x1__ = (ForInOfBodyEvaluation LeftHandSideExpression Statement keyResult CONST_enumerate CONST_assignment labelSet)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
