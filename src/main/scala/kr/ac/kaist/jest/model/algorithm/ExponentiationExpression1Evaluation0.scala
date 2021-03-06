package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ExponentiationExpression1Evaluation0 extends Algorithm {
  val name: String = "ExponentiationExpression1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ExponentiationExpression1Evaluation0" (this, UpdateExpression, ExponentiationExpression) => {
    access __x0__ = (UpdateExpression "Evaluation")
    let left = __x0__
    app __x1__ = (GetValue left)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let leftValue = __x1__
    access __x2__ = (ExponentiationExpression "Evaluation")
    let right = __x2__
    app __x3__ = (GetValue right)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rightValue = __x3__
    app __x4__ = (ToNumeric leftValue)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let base = __x4__
    app __x5__ = (ToNumeric rightValue)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let exponent = __x5__
    app __x6__ = (Type base)
    app __x7__ = (Type exponent)
    if (! (= __x6__ __x7__)) {
      app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x8__
    } else {}
    app T = (Type base)
    app result = (PRIMITIVES[T].exponentiate base exponent)
    ? result
    app wrapped = (WrapCompletion result)
    return wrapped
  }"""), this)
}
