package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClauses1StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""CaseClauses1StatementRules0""", List(Id("""this"""), Id("""CaseClauses"""), Id("""CaseClause""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses"""))), EStr("""HasCallInTailPosition""")).setId(45218), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45219), ILet(Id("""has"""), ERef(RefId(Id("""__x1__""")))).setId(45220), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(45222), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45223))).setId(45224), ISeq(List()).setId(45225)).setId(45226), IAccess(Id("""__x3__"""), ERef(RefId(Id("""CaseClause"""))), EStr("""HasCallInTailPosition""")).setId(45228), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""call"""))))).setId(45229), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(45230), IReturn(ERef(RefId(Id("""__x5__""")))).setId(45231))).setId(-1))
  /* Beautified form:
  "CaseClauses1StatementRules0" (this, CaseClauses, CaseClause) => {
    access __x0__ = (CaseClauses "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    let has = __x1__
    if (= has true) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    access __x3__ = (CaseClause "HasCallInTailPosition")
    app __x4__ = (__x3__ call)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
