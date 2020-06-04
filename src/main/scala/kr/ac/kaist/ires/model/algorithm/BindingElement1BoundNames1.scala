package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingElement1BoundNames1 {
  val length: Int = 0
  val func: Func = Func("""BindingElement1BoundNames1""", List(Id("""this"""), Id("""BindingPattern"""), Id("""Initializer""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingPattern"""))), EStr("""BoundNames""")).setId(27967), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27968))).setId(-1))
  /* Beautified form:
  "BindingElement1BoundNames1" (this, BindingPattern, Initializer) => {
    access __x0__ = (BindingPattern "BoundNames")
    return __x0__
  }
  */
}
