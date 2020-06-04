package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClause0LexicallyScopedDeclarations1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0LexicallyScopedDeclarations1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""LexicallyScopedDeclarations""")).setId(35063), IReturn(ERef(RefId(Id("""__x0__""")))).setId(35064))).setId(35065), ISeq(List()).setId(35066)).setId(35067), IReturn(EList(List())).setId(35069))).setId(-1))
  /* Beautified form:
  "CaseClause0LexicallyScopedDeclarations1" (this, Expression, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "LexicallyScopedDeclarations")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
