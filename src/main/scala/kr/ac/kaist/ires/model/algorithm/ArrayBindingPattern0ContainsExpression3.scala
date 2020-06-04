package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArrayBindingPattern0ContainsExpression3 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern0ContainsExpression3""", List(Id("""this"""), Id("""Elision"""), Id("""BindingRestElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingRestElement"""))), EStr("""ContainsExpression""")).setId(27987), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27988))).setId(-1))
  /* Beautified form:
  "ArrayBindingPattern0ContainsExpression3" (this, Elision, BindingRestElement) => {
    access __x0__ = (BindingRestElement "ContainsExpression")
    return __x0__
  }
  */
}
