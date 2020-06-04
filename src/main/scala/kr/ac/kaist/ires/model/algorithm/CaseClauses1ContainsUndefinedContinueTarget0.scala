package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClauses1ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""CaseClauses1ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""CaseClauses"""), Id("""CaseClause"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(34721), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(34722), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(34723), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(34725), ISeq(List()).setId(34727)).setId(34728), IAccess(Id("""__x2__"""), ERef(RefId(Id("""CaseClause"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(34730), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(34731), IReturn(ERef(RefId(Id("""__x3__""")))).setId(34732))).setId(-1))
  /* Beautified form:
  "CaseClauses1ContainsUndefinedContinueTarget0" (this, CaseClauses, CaseClause, iterationSet, labelSet) => {
    access __x0__ = (CaseClauses "ContainsUndefinedContinueTarget")
    app __x1__ = (__x0__ iterationSet (new []))
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (CaseClause "ContainsUndefinedContinueTarget")
    app __x3__ = (__x2__ iterationSet (new []))
    return __x3__
  }
  */
}
