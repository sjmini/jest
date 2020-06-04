package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UnaryExpression3Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression3Evaluation0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UnaryExpression"""))), EStr("""Evaluation""")).setId(19365), ILet(Id("""val"""), ERef(RefId(Id("""__x0__""")))).setId(19366), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""val""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""val""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""val""")), ERef(RefProp(RefId(Id("""val""")), EStr("""Value""")))).setId(19368), IReturn(ERef(RefId(Id("""val""")))).setId(19369)).setId(19370), ISeq(List()).setId(19371)).setId(19372), IExpr(ERef(RefId(Id("""val""")))).setId(19373), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""val"""))))).setId(19375), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Reference""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IsUnresolvableReference"""))), List(ERef(RefId(Id("""val"""))))).setId(19376), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""undefined"""))).setId(19377), IReturn(ERef(RefId(Id("""__x3__""")))).setId(19378))).setId(19379), ISeq(List()).setId(19371)).setId(19380))).setId(19382), ISeq(List()).setId(19371)).setId(19383), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""val"""))))).setId(19385), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(19386), IReturn(ERef(RefId(Id("""__x4__""")))).setId(19387)).setId(19388), ISeq(List()).setId(19371)).setId(19389), IAssign(RefId(Id("""val""")), ERef(RefId(Id("""__x4__""")))).setId(19390), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetTypeOf"""))), List(ERef(RefId(Id("""val"""))))).setId(19392), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(19393), IReturn(ERef(RefId(Id("""__x6__""")))).setId(19394))).setId(-1))
  /* Beautified form:
  "UnaryExpression3Evaluation0" (this, UnaryExpression) => {
    access __x0__ = (UnaryExpression "Evaluation")
    let val = __x0__
    if (= (typeof val) "Completion") if (= val["Type"] CONST_normal) val = val["Value"] else return val else {}
    val
    app __x1__ = (Type val)
    if (= __x1__ Reference) {
      app __x2__ = (IsUnresolvableReference val)
      if (= __x2__ true) {
        app __x3__ = (WrapCompletion "undefined")
        return __x3__
      } else {}
    } else {}
    app __x4__ = (GetValue val)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    val = __x4__
    app __x5__ = (GetTypeOf val)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
