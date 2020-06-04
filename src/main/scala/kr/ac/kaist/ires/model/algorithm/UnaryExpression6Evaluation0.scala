package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UnaryExpression6Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression6Evaluation0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UnaryExpression"""))), EStr("""Evaluation""")).setId(19581), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))).setId(19582), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""expr"""))))).setId(19584), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(19585), IReturn(ERef(RefId(Id("""__x1__""")))).setId(19586)).setId(19587), ISeq(List()).setId(19588)).setId(19589), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToInt32"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(19590), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(19591), IReturn(ERef(RefId(Id("""__x2__""")))).setId(19592)).setId(19593), ISeq(List()).setId(19588)).setId(19594), ILet(Id("""oldValue"""), ERef(RefId(Id("""__x2__""")))).setId(19595), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUOp(OBNot, ERef(RefId(Id("""oldValue""")))))).setId(19597), IReturn(ERef(RefId(Id("""__x3__""")))).setId(19598))).setId(-1))
  /* Beautified form:
  "UnaryExpression6Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let expr = __x0__
    app __x1__ = (GetValue expr)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToInt32 __x1__)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let oldValue = __x2__
    app __x3__ = (WrapCompletion (~ oldValue))
    return __x3__
  }
  */
}
