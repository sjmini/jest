package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement2VarScopedDeclarations7 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement2VarScopedDeclarations7""", List(Id("""this"""), Id("""Expression0"""), Id("""Expression1"""), Id("""Expression2"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(31095), IReturn(ERef(RefId(Id("""__x0__""")))).setId(31096))).setId(-1))
  /* Beautified form:
  "IterationStatement2VarScopedDeclarations7" (this, Expression0, Expression1, Expression2, Statement) => {
    access __x0__ = (Statement "VarScopedDeclarations")
    return __x0__
  }
  */
}
