package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object WithStatement0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""WithStatement0VarScopedDeclarations0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(34172), IReturn(ERef(RefId(Id("""__x0__""")))).setId(34173))).setId(-1))
  /* Beautified form:
  "WithStatement0VarScopedDeclarations0" (this, Expression, Statement) => {
    access __x0__ = (Statement "VarScopedDeclarations")
    return __x0__
  }
  */
}
