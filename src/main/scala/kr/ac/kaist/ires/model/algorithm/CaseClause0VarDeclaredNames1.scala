package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClause0VarDeclaredNames1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0VarDeclaredNames1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""VarDeclaredNames""")).setId(35224), IReturn(ERef(RefId(Id("""__x0__""")))).setId(35225))).setId(35226), ISeq(List()).setId(35227)).setId(35228), IReturn(EList(List())).setId(35230))).setId(-1))
  /* Beautified form:
  "CaseClause0VarDeclaredNames1" (this, Expression, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "VarDeclaredNames")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
