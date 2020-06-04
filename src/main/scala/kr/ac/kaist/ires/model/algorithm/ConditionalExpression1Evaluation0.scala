package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ConditionalExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ConditionalExpression1Evaluation0""", List(Id("""this"""), Id("""LogicalORExpression"""), Id("""AssignmentExpression0"""), Id("""AssignmentExpression1""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LogicalORExpression"""))), EStr("""Evaluation""")).setId(22505), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(22506), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(22508), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(22509), IReturn(ERef(RefId(Id("""__x1__""")))).setId(22510)).setId(22511), ISeq(List()).setId(22512)).setId(22513), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(22514), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(22515), IReturn(ERef(RefId(Id("""__x2__""")))).setId(22516)).setId(22517), ISeq(List()).setId(22512)).setId(22518), ILet(Id("""lval"""), ERef(RefId(Id("""__x2__""")))).setId(22519), IIf(EBOp(OEq, ERef(RefId(Id("""lval"""))), EBool(true)), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""AssignmentExpression0"""))), EStr("""Evaluation""")).setId(22522), ILet(Id("""trueRef"""), ERef(RefId(Id("""__x3__""")))).setId(22523), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""trueRef"""))))).setId(22525), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(22526), IReturn(ERef(RefId(Id("""__x4__""")))).setId(22527)).setId(22528), ISeq(List()).setId(22512)).setId(22529), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(22530), IReturn(ERef(RefId(Id("""__x5__""")))).setId(22531))).setId(22533), ISeq(List(IAccess(Id("""__x6__"""), ERef(RefId(Id("""AssignmentExpression1"""))), EStr("""Evaluation""")).setId(22535), ILet(Id("""falseRef"""), ERef(RefId(Id("""__x6__""")))).setId(22536), IApp(Id("""__x7__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""falseRef"""))))).setId(22538), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(22539), IReturn(ERef(RefId(Id("""__x7__""")))).setId(22540)).setId(22541), ISeq(List()).setId(22512)).setId(22542), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(22543), IReturn(ERef(RefId(Id("""__x8__""")))).setId(22544))).setId(22546)).setId(22547))).setId(-1))
  /* Beautified form:
  "ConditionalExpression1Evaluation0" (this, LogicalORExpression, AssignmentExpression0, AssignmentExpression1) => {
    access __x0__ = (LogicalORExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToBoolean __x1__)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let lval = __x2__
    if (= lval true) {
      access __x3__ = (AssignmentExpression0 "Evaluation")
      let trueRef = __x3__
      app __x4__ = (GetValue trueRef)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {
      access __x6__ = (AssignmentExpression1 "Evaluation")
      let falseRef = __x6__
      app __x7__ = (GetValue falseRef)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      app __x8__ = (WrapCompletion __x7__)
      return __x8__
    }
  }
  */
}
