package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionStatementList0VarScopedDeclarations1 {
  val length: Int = 0
  val func: Func = Func("""FunctionStatementList0VarScopedDeclarations1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""TopLevelVarScopedDeclarations""")).setId(38120), IReturn(ERef(RefId(Id("""__x0__""")))).setId(38121))).setId(-1))
  /* Beautified form:
  "FunctionStatementList0VarScopedDeclarations1" (this, StatementList) => {
    access __x0__ = (StatementList "TopLevelVarScopedDeclarations")
    return __x0__
  }
  */
}
