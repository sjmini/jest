package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DefaultClause0VarScopedDeclarations1 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0VarScopedDeclarations1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""VarScopedDeclarations""")).setId(35408), IReturn(ERef(RefId(Id("""__x0__""")))).setId(35409))).setId(35410), ISeq(List()).setId(35411)).setId(35412), IReturn(EList(List())).setId(35414))).setId(-1))
  /* Beautified form:
  "DefaultClause0VarScopedDeclarations1" (this, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "VarScopedDeclarations")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
