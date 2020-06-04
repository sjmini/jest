package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DefaultClause0VarDeclaredNames1 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0VarDeclaredNames1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""VarDeclaredNames""")).setId(35247), IReturn(ERef(RefId(Id("""__x0__""")))).setId(35248))).setId(35249), ISeq(List()).setId(35250)).setId(35251), IReturn(EList(List())).setId(35253))).setId(-1))
  /* Beautified form:
  "DefaultClause0VarDeclaredNames1" (this, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "VarDeclaredNames")
      return __x0__
    } else {}
    return (new [])
  }
  */
}
