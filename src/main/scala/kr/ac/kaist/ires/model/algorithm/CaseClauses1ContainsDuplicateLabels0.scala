package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClauses1ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""CaseClauses1ContainsDuplicateLabels0""", List(Id("""this"""), Id("""CaseClauses"""), Id("""CaseClause"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses"""))), EStr("""ContainsDuplicateLabels""")).setId(34367), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34368), ILet(Id("""hasDuplicates"""), ERef(RefId(Id("""__x1__""")))).setId(34369), IIf(EBOp(OEq, ERef(RefId(Id("""hasDuplicates"""))), EBool(true)), IReturn(EBool(true)).setId(34371), ISeq(List()).setId(34373)).setId(34374), IAccess(Id("""__x2__"""), ERef(RefId(Id("""CaseClause"""))), EStr("""ContainsDuplicateLabels""")).setId(34376), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34377), IReturn(ERef(RefId(Id("""__x3__""")))).setId(34378))).setId(-1))
  /* Beautified form:
  "CaseClauses1ContainsDuplicateLabels0" (this, CaseClauses, CaseClause, labelSet) => {
    access __x0__ = (CaseClauses "ContainsDuplicateLabels")
    app __x1__ = (__x0__ labelSet)
    let hasDuplicates = __x1__
    if (= hasDuplicates true) return true else {}
    access __x2__ = (CaseClause "ContainsDuplicateLabels")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }
  */
}
