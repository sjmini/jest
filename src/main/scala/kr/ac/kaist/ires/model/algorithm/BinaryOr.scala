package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BinaryOr {
  val length: Int = 2
  val func: Func = parseFunc(""""BinaryOr" (x, y) => {
    assert (|| (= x 0i) (= x 1i))
    assert (|| (= y 0i) (= y 1i))
    if (|| (= x 1i) (= y 1i)) {
      app __x0__ = (WrapCompletion 1i)
      return __x0__
    } else {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    }
  }""")
}
