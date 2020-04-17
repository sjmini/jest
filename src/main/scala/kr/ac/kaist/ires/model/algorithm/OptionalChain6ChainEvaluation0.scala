package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OptionalChain6ChainEvaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""OptionalChain6ChainEvaluation0" (this, OptionalChain, IdentifierName, baseValue, baseReference) => {
    let optionalChain = OptionalChain
    access __x0__ = (optionalChain "ChainEvaluation")
    app __x1__ = (__x0__ baseValue baseReference)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let newReference = __x1__
    app __x2__ = (GetValue newReference)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let newValue = __x2__
    if true let strict = true else let strict = false
    app __x3__ = (EvaluatePropertyAccessWithIdentifierKey newValue IdentifierName strict)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }""")
}
