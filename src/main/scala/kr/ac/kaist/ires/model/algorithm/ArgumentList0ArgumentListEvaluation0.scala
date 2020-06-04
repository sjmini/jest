package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArgumentList0ArgumentListEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ArgumentList0ArgumentListEvaluation0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(17997), ILet(Id("""ref"""), ERef(RefId(Id("""__x0__""")))).setId(17998), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""ref"""))))).setId(18000), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(18001), IReturn(ERef(RefId(Id("""__x1__""")))).setId(18002)).setId(18003), ISeq(List()).setId(18004)).setId(18005), ILet(Id("""arg"""), ERef(RefId(Id("""__x1__""")))).setId(18006), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List(ERef(RefId(Id("""arg"""))))))).setId(18008), IReturn(ERef(RefId(Id("""__x2__""")))).setId(18009))).setId(-1))
  /* Beautified form:
  "ArgumentList0ArgumentListEvaluation0" (this, AssignmentExpression) => {
    access __x0__ = (AssignmentExpression "Evaluation")
    let ref = __x0__
    app __x1__ = (GetValue ref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let arg = __x1__
    app __x2__ = (WrapCompletion (new [arg]))
    return __x2__
  }
  */
}
