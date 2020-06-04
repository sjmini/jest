package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement11VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement11VarScopedDeclarations0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(32396), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32397))).setId(-1))
  /* Beautified form:
  "IterationStatement11VarScopedDeclarations0" (this, LeftHandSideExpression, AssignmentExpression, Statement) => {
    access __x0__ = (Statement "VarScopedDeclarations")
    return __x0__
  }
  */
}
