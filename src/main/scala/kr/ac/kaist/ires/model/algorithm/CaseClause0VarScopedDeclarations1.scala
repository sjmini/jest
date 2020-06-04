package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClause0VarScopedDeclarations1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0VarScopedDeclarations1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""VarScopedDeclarations""")).setId(35385), IReturn(ERef(RefId(Id("""__x0__""")))).setId(35386))).setId(35387), ISeq(List()).setId(35388)).setId(35389), IReturn(EList(List())).setId(35391))).setId(-1))
  /* Beautified form:
  "CaseClause0VarScopedDeclarations1" (this, Expression, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "VarScopedDeclarations")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
