package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingProperty1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""BindingProperty1BoundNames0""", List(Id("""this"""), Id("""PropertyName"""), Id("""BindingElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElement"""))), EStr("""BoundNames""")).setId(27947), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27948))).setId(-1))
  /* Beautified form:
  "BindingProperty1BoundNames0" (this, PropertyName, BindingElement) => {
    access __x0__ = (BindingElement "BoundNames")
    return __x0__
  }
  */
}
