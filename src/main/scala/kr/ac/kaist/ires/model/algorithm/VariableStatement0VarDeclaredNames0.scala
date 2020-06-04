package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object VariableStatement0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""VariableStatement0VarDeclaredNames0""", List(Id("""this"""), Id("""VariableDeclarationList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""VariableDeclarationList"""))), EStr("""BoundNames""")).setId(27491), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27492))).setId(-1))
  /* Beautified form:
  "VariableStatement0VarDeclaredNames0" (this, VariableDeclarationList) => {
    access __x0__ = (VariableDeclarationList "BoundNames")
    return __x0__
  }
  */
}
