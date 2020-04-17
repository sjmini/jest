package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StrictEqualityComparison {
  val length: Int = 0
  val func: Func = parseFunc(""""StrictEqualityComparison" (x, y) => {
    app __x0__ = (Type x)
    app __x1__ = (Type y)
    if (! (= __x0__ __x1__)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (Type x)
    if (|| (= __x3__ Number) (= __x3__ BigInt)) {
      app __x4__ = (Type x)
      access __x5__ = (PRIMITIVES __x4__)
      access __x6__ = (__x5__ "equal")
      app __x7__ = (__x6__ x y)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      app __x8__ = (WrapCompletion __x7__)
      return __x8__
    } else {}
    app __x9__ = (SameValueNonNumeric x y)
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    app __x10__ = (WrapCompletion __x9__)
    return __x10__
  }""")
}
