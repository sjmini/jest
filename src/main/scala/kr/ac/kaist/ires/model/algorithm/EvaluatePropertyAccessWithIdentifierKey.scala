package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EvaluatePropertyAccessWithIdentifierKey {
  val length: Int = 3
  val func: Func = parseFunc(""""EvaluatePropertyAccessWithIdentifierKey" (baseValue, identifierName, strict) => {
    app __x0__ = (RequireObjectCoercible baseValue)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let bv = __x0__
    access __x1__ = (identifierName "StringValue")
    let propertyNameString = __x1__
    app __x2__ = (WrapCompletion (new Reference("BaseValue" -> bv, "ReferencedName" -> propertyNameString, "StrictReference" -> strict)))
    return __x2__
  }""")
}
