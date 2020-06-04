package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SwitchStatement0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""SwitchStatement0VarScopedDeclarations0""", List(Id("""this"""), Id("""Expression"""), Id("""CaseBlock""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseBlock"""))), EStr("""VarScopedDeclarations""")).setId(35270), IReturn(ERef(RefId(Id("""__x0__""")))).setId(35271))).setId(-1))
  /* Beautified form:
  "SwitchStatement0VarScopedDeclarations0" (this, Expression, CaseBlock) => {
    access __x0__ = (CaseBlock "VarScopedDeclarations")
    return __x0__
  }
  */
}
