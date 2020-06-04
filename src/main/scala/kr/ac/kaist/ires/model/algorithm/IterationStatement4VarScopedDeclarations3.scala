package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement4VarScopedDeclarations3 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement4VarScopedDeclarations3""", List(Id("""this"""), Id("""LexicalDeclaration"""), Id("""Expression0"""), Id("""Expression1"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(31145), IReturn(ERef(RefId(Id("""__x0__""")))).setId(31146))).setId(-1))
  /* Beautified form:
  "IterationStatement4VarScopedDeclarations3" (this, LexicalDeclaration, Expression0, Expression1, Statement) => {
    access __x0__ = (Statement "VarScopedDeclarations")
    return __x0__
  }
  */
}
