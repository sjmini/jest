package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClause0LexicallyDeclaredNames1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0LexicallyDeclaredNames1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""LexicallyDeclaredNames""")).setId(34912), IReturn(ERef(RefId(Id("""__x0__""")))).setId(34913))).setId(34914), ISeq(List()).setId(34915)).setId(34916), IReturn(EList(List())).setId(34918))).setId(-1))
  /* Beautified form:
  "CaseClause0LexicallyDeclaredNames1" (this, Expression, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "LexicallyDeclaredNames")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
