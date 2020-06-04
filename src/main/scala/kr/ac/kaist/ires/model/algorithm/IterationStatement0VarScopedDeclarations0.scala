package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement0VarScopedDeclarations0""", List(Id("""this"""), Id("""Statement"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(30726), IReturn(ERef(RefId(Id("""__x0__""")))).setId(30727))).setId(-1))
  /* Beautified form:
  "IterationStatement0VarScopedDeclarations0" (this, Statement, Expression) => {
    access __x0__ = (Statement "VarScopedDeclarations")
    return __x0__
  }
  */
}
