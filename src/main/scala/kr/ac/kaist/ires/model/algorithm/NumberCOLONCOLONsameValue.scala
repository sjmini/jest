package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NumberCOLONCOLONsameValue {
  val length: Int = 2
  val func: Func = parseFunc(""""Number::sameValue" (x, y) => {
    if (&& (= x NaN) (= y NaN)) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    if (&& (= x 0i) (= y -0.0)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (&& (= x -0.0) (= y 0i)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    if (= x y) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion false)
    return __x4__
  }""")
}
