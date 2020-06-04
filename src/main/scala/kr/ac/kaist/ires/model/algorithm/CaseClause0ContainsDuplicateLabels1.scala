package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClause0ContainsDuplicateLabels1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0ContainsDuplicateLabels1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""ContainsDuplicateLabels""")).setId(34401), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34402), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34403))).setId(34404), ISeq(List()).setId(34405)).setId(34406), IReturn(EBool(false)).setId(34408))).setId(-1))
  /* Beautified form:
  "CaseClause0ContainsDuplicateLabels1" (this, Expression, StatementList, labelSet) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "ContainsDuplicateLabels")
      app __x1__ = (__x0__ labelSet)
      return __x1__
    } else {}
    return false
  }
  */
}
