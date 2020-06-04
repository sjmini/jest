package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DefaultClause0LexicallyScopedDeclarations1 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0LexicallyScopedDeclarations1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""LexicallyScopedDeclarations""")).setId(35086), IReturn(ERef(RefId(Id("""__x0__""")))).setId(35087))).setId(35088), ISeq(List()).setId(35089)).setId(35090), IReturn(EList(List())).setId(35092))).setId(-1))
  /* Beautified form:
  "DefaultClause0LexicallyScopedDeclarations1" (this, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "LexicallyScopedDeclarations")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
