package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ClassExpression0Evaluation1 {
  val length: Int = 0
  val func: Func = Func("""ClassExpression0Evaluation1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""ClassTail""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""BindingIdentifier"""))), EAbsent), ILet(Id("""className"""), EUndef).setId(43311), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(43313), ILet(Id("""className"""), ERef(RefId(Id("""__x0__""")))).setId(43314))).setId(43315)).setId(43316), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ClassTail"""))), EStr("""ClassDefinitionEvaluation""")).setId(43318), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""className"""))), ERef(RefId(Id("""className"""))))).setId(43319), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(43320), IReturn(ERef(RefId(Id("""__x2__""")))).setId(43321)).setId(43322), ISeq(List()).setId(43323)).setId(43324), ILet(Id("""value"""), ERef(RefId(Id("""__x2__""")))).setId(43325), IAssign(RefProp(RefId(Id("""value""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(43327), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(43329), IReturn(ERef(RefId(Id("""__x3__""")))).setId(43330))).setId(-1))
  /* Beautified form:
  "ClassExpression0Evaluation1" (this, BindingIdentifier, ClassTail) => {
    if (= BindingIdentifier absent) let className = undefined else {
      access __x0__ = (BindingIdentifier "StringValue")
      let className = __x0__
    }
    access __x1__ = (ClassTail "ClassDefinitionEvaluation")
    app __x2__ = (__x1__ className className)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let value = __x2__
    value["SourceText"] = (get-syntax this)
    app __x3__ = (WrapCompletion value)
    return __x3__
  }
  */
}
