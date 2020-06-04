package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClauses1ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""CaseClauses1ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""CaseClauses"""), Id("""CaseClause"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(34544), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34545), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(34546), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(34548), ISeq(List()).setId(34550)).setId(34551), IAccess(Id("""__x2__"""), ERef(RefId(Id("""CaseClause"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(34553), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34554), IReturn(ERef(RefId(Id("""__x3__""")))).setId(34555))).setId(-1))
  /* Beautified form:
  "CaseClauses1ContainsUndefinedBreakTarget0" (this, CaseClauses, CaseClause, labelSet) => {
    access __x0__ = (CaseClauses "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (CaseClause "ContainsUndefinedBreakTarget")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }
  */
}
