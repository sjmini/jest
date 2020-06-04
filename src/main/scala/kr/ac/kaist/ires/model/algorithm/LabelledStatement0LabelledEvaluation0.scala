package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledStatement0LabelledEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""LabelledStatement0LabelledEvaluation0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""LabelledItem"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelIdentifier"""))), EStr("""StringValue""")).setId(36479), ILet(Id("""label"""), ERef(RefId(Id("""__x0__""")))).setId(36480), IAppend(ERef(RefId(Id("""label"""))), ERef(RefId(Id("""labelSet""")))).setId(36482), IAccess(Id("""__x1__"""), ERef(RefId(Id("""LabelledItem"""))), EStr("""LabelledEvaluation""")).setId(36484), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36485), ILet(Id("""stmtResult"""), ERef(RefId(Id("""__x2__""")))).setId(36486), ILet(Id("""__x3__"""), EBOp(OEq, ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_break"""))))).setId(36494), IIf(ERef(RefId(Id("""__x3__"""))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Target"""))), ERef(RefId(Id("""label"""))))).setId(36488), IAssign(RefId(Id("""__x3__""")), EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true))).setId(36491))).setId(36492), ISeq(List()).setId(36493)).setId(36495), IIf(ERef(RefId(Id("""__x3__"""))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefProp(RefId(Id("""stmtResult""")), EStr("""Value"""))))).setId(36496), IAssign(RefId(Id("""stmtResult""")), ERef(RefId(Id("""__x5__""")))).setId(36497))).setId(36499), ISeq(List()).setId(36493)).setId(36500), IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""stmtResult"""))))).setId(36502), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(36503), IReturn(ERef(RefId(Id("""__x7__""")))).setId(36504))).setId(-1))
  /* Beautified form:
  "LabelledStatement0LabelledEvaluation0" (this, LabelIdentifier, LabelledItem, labelSet) => {
    access __x0__ = (LabelIdentifier "StringValue")
    let label = __x0__
    append label -> labelSet
    access __x1__ = (LabelledItem "LabelledEvaluation")
    app __x2__ = (__x1__ labelSet)
    let stmtResult = __x2__
    let __x3__ = (= stmtResult["Type"] CONST_break)
    if __x3__ {
      app __x4__ = (SameValue stmtResult["Target"] label)
      __x3__ = (= __x4__ true)
    } else {}
    if __x3__ {
      app __x5__ = (NormalCompletion stmtResult["Value"])
      stmtResult = __x5__
    } else {}
    app __x6__ = (Completion stmtResult)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
