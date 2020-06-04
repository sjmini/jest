package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement1VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement1VarScopedDeclarations0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(30905), IReturn(ERef(RefId(Id("""__x0__""")))).setId(30906))).setId(-1))
  /* Beautified form:
  "IterationStatement1VarScopedDeclarations0" (this, Expression, Statement) => {
    access __x0__ = (Statement "VarScopedDeclarations")
    return __x0__
  }
  */
}
