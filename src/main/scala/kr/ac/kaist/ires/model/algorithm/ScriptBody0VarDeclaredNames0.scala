package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ScriptBody0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""ScriptBody0VarDeclaredNames0""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""TopLevelVarDeclaredNames""")).setId(46284), IReturn(ERef(RefId(Id("""__x0__""")))).setId(46285))).setId(-1))
  /* Beautified form:
  "ScriptBody0VarDeclaredNames0" (this, StatementList) => {
    access __x0__ = (StatementList "TopLevelVarDeclaredNames")
    return __x0__
  }
  */
}
