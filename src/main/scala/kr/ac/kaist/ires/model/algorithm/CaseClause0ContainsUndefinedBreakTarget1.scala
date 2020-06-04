package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClause0ContainsUndefinedBreakTarget1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0ContainsUndefinedBreakTarget1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(34578), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34579), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34580))).setId(34581), ISeq(List()).setId(34582)).setId(34583), IReturn(EBool(false)).setId(34585))).setId(-1))
  /* Beautified form:
  "CaseClause0ContainsUndefinedBreakTarget1" (this, Expression, StatementList, labelSet) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "ContainsUndefinedBreakTarget")
      app __x1__ = (__x0__ labelSet)
      return __x1__
    } else {}
    return false
  }
  */
}
