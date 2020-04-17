package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NumberCOLONCOLONbitwiseNOT {
  val length: Int = 1
  val func: Func = parseFunc(""""Number::bitwiseNOT" (x) => {
    app __x0__ = (ToInt32 x)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let oldValue = __x0__
    app __x1__ = (WrapCompletion (~ oldValue))
    return __x1__
  }""")
}
