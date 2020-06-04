package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object VariableDeclaration0BoundNames1 {
  val length: Int = 0
  val func: Func = Func("""VariableDeclaration0BoundNames1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""Initializer""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BoundNames""")).setId(27471), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27472))).setId(-1))
  /* Beautified form:
  "VariableDeclaration0BoundNames1" (this, BindingIdentifier, Initializer) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }
  */
}
