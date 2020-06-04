package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DefaultClause0LexicallyDeclaredNames1 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0LexicallyDeclaredNames1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""LexicallyDeclaredNames""")).setId(34935), IReturn(ERef(RefId(Id("""__x0__""")))).setId(34936))).setId(34937), ISeq(List()).setId(34938)).setId(34939), IReturn(EList(List())).setId(34941))).setId(-1))
  /* Beautified form:
  "DefaultClause0LexicallyDeclaredNames1" (this, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "LexicallyDeclaredNames")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
