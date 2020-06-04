package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UnaryExpression5Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression5Evaluation0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UnaryExpression"""))), EStr("""Evaluation""")).setId(19509), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))).setId(19510), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""expr"""))))).setId(19512), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(19513), IReturn(ERef(RefId(Id("""__x1__""")))).setId(19514)).setId(19515), ISeq(List()).setId(19516)).setId(19517), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(19518), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(19519), IReturn(ERef(RefId(Id("""__x2__""")))).setId(19520)).setId(19521), ISeq(List()).setId(19516)).setId(19522), ILet(Id("""oldValue"""), ERef(RefId(Id("""__x2__""")))).setId(19523), IIf(EBOp(OEq, ERef(RefId(Id("""oldValue"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENum(Double.NaN))).setId(19525), IReturn(ERef(RefId(Id("""__x3__""")))).setId(19526))).setId(19527), ISeq(List()).setId(19516)).setId(19528), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUOp(ONeg, ERef(RefId(Id("""oldValue""")))))).setId(19530), IReturn(ERef(RefId(Id("""__x4__""")))).setId(19531))).setId(-1))
  /* Beautified form:
  "UnaryExpression5Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let expr = __x0__
    app __x1__ = (GetValue expr)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToNumber __x1__)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let oldValue = __x2__
    if (= oldValue NaN) {
      app __x3__ = (WrapCompletion NaN)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion (- oldValue))
    return __x4__
  }
  */
}
