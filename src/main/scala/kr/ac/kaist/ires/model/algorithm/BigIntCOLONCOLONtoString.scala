package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONtoString {
  val length: Int = 1
  val func: Func = parseFunc(""""BigInt::toString" (x) => {
    if (< x 0i) {
      access __x0__ = (PRIMITIVES BigInt)
      access __x1__ = (__x0__ "toString")
      app __x2__ = (__x1__ (- x))
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion (+ "-" __x2__))
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion (convert x num2str ))
    return __x4__
  }""")
}
