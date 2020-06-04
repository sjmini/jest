package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayBindingPattern2BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern2BoundNames0""", List(Id("""this"""), Id("""BindingElementList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElementList"""))), EStr("""BoundNames""")).setId(27797), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27798))).setId(-1))
  /* Beautified form:
  "ArrayBindingPattern2BoundNames0" (this, BindingElementList) => {
    access __x0__ = (BindingElementList "BoundNames")
    return __x0__
  }
  */
}
