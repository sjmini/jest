package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NumberCOLONCOLONunaryMinus {
  val length: Int = 1
  val func: Func = parseFunc(""""Number::unaryMinus" (x) => {
    if (= x NaN) {
      app __x0__ = (WrapCompletion NaN)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion (- x))
    return __x1__
  }""")
}
