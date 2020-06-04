package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ScriptEvaluationJob {
  val length: Int = 2
  val func: Func = Func("""ScriptEvaluationJob""", List(Id("""sourceText"""), Id("""hostDefined""")), None, ISeq(List(ILet(Id("""realm"""), ERef(RefId(Id("""REALM""")))).setId(47041), IApp(Id("""__x0__"""), ERef(RefId(Id("""ParseScript"""))), List(ERef(RefId(Id("""sourceText"""))), ERef(RefId(Id("""realm"""))), ERef(RefId(Id("""hostDefined"""))))).setId(47043), ILet(Id("""s"""), ERef(RefId(Id("""__x0__""")))).setId(47044), IApp(Id("""__x1__"""), ERef(RefId(Id("""ScriptEvaluation"""))), List(ERef(RefId(Id("""s"""))))).setId(47046), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(47047), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47048)).setId(47049), ISeq(List()).setId(47040)).setId(47050), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(47051), IReturn(ERef(RefId(Id("""__x2__""")))).setId(47052))).setId(-1))
  /* Beautified form:
  "ScriptEvaluationJob" (sourceText, hostDefined) => {
    let realm = REALM
    app __x0__ = (ParseScript sourceText realm hostDefined)
    let s = __x0__
    app __x1__ = (ScriptEvaluation s)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
