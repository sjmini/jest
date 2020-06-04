package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingProperty1ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""BindingProperty1ContainsExpression0""", List(Id("""this"""), Id("""PropertyName"""), Id("""BindingElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""IsComputedPropertyKey""")).setId(28101), ILet(Id("""has"""), ERef(RefId(Id("""__x0__""")))).setId(28102), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), IReturn(EBool(true)).setId(28104), ISeq(List()).setId(28106)).setId(28107), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingElement"""))), EStr("""ContainsExpression""")).setId(28109), IReturn(ERef(RefId(Id("""__x1__""")))).setId(28110))).setId(-1))
  /* Beautified form:
  "BindingProperty1ContainsExpression0" (this, PropertyName, BindingElement) => {
    access __x0__ = (PropertyName "IsComputedPropertyKey")
    let has = __x0__
    if (= has true) return true else {}
    access __x1__ = (BindingElement "ContainsExpression")
    return __x1__
  }
  */
}
