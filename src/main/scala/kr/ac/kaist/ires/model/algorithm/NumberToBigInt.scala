package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NumberToBigInt {
  val length: Int = 1
  val func: Func = parseFunc(""""NumberToBigInt" (number) => {
    app __x0__ = (Type number)
    assert (= __x0__ Number)
    app __x1__ = (IsInteger number)
    if (= __x1__ false) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    return (convert number num2bigint )
  }""")
}
