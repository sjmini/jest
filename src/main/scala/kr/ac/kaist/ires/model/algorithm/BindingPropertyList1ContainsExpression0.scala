package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingPropertyList1ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""BindingPropertyList1ContainsExpression0""", List(Id("""this"""), Id("""BindingPropertyList"""), Id("""BindingProperty""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingPropertyList"""))), EStr("""ContainsExpression""")).setId(28035), ILet(Id("""has"""), ERef(RefId(Id("""__x0__""")))).setId(28036), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), IReturn(EBool(true)).setId(28038), ISeq(List()).setId(28040)).setId(28041), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingProperty"""))), EStr("""ContainsExpression""")).setId(28043), IReturn(ERef(RefId(Id("""__x1__""")))).setId(28044))).setId(-1))
  /* Beautified form:
  "BindingPropertyList1ContainsExpression0" (this, BindingPropertyList, BindingProperty) => {
    access __x0__ = (BindingPropertyList "ContainsExpression")
    let has = __x0__
    if (= has true) return true else {}
    access __x1__ = (BindingProperty "ContainsExpression")
    return __x1__
  }
  */
}
