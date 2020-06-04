package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement13VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement13VarDeclaredNames0""", List(Id("""this"""), Id("""ForDeclaration"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(32329), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32330))).setId(-1))
  /* Beautified form:
  "IterationStatement13VarDeclaredNames0" (this, ForDeclaration, AssignmentExpression, Statement) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }
  */
}
