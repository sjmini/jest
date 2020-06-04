package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ScriptBody0LexicallyScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""ScriptBody0LexicallyScopedDeclarations0""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""TopLevelLexicallyScopedDeclarations""")).setId(46274), IReturn(ERef(RefId(Id("""__x0__""")))).setId(46275))).setId(-1))
  /* Beautified form:
  "ScriptBody0LexicallyScopedDeclarations0" (this, StatementList) => {
    access __x0__ = (StatementList "TopLevelLexicallyScopedDeclarations")
    return __x0__
  }
  */
}
