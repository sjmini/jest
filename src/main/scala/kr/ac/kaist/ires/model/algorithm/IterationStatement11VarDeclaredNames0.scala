package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement11VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement11VarDeclaredNames0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(32229), IReturn(ERef(RefId(Id("""__x0__""")))).setId(32230))).setId(-1))
  /* Beautified form:
  "IterationStatement11VarDeclaredNames0" (this, LeftHandSideExpression, AssignmentExpression, Statement) => {
    access __x0__ = (Statement "VarDeclaredNames")
    return __x0__
  }
  */
}
