package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONsignedRightShift {
  val length: Int = 2
  val func: Func = parseFunc(""""BigInt::signedRightShift" (x, y) => {
    access __x0__ = (PRIMITIVES BigInt)
    access __x1__ = (__x0__ "leftShift")
    app __x2__ = (__x1__ x (- y))
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }""")
}