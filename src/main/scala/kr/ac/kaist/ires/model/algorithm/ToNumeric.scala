package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToNumeric {
  val length: Int = 1
  val func: Func = parseFunc(""""ToNumeric" (value) => {
    app __x0__ = (ToPrimitive value Number)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let primValue = __x0__
    app __x1__ = (Type primValue)
    if (= __x1__ BigInt) {
      app __x2__ = (WrapCompletion primValue)
      return __x2__
    } else {}
    app __x3__ = (ToNumber primValue)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }""")
}
