package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClause0ContainsUndefinedContinueTarget1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0ContainsUndefinedContinueTarget1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(34755), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(34756), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34757))).setId(34758), ISeq(List()).setId(34759)).setId(34760), IReturn(EBool(false)).setId(34762))).setId(-1))
  /* Beautified form:
  "CaseClause0ContainsUndefinedContinueTarget1" (this, Expression, StatementList, iterationSet, labelSet) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "ContainsUndefinedContinueTarget")
      app __x1__ = (__x0__ iterationSet (new []))
      return __x1__
    } else {}
    return false
  }
  */
}
