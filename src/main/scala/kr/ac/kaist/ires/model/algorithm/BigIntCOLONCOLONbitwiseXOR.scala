package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONbitwiseXOR {
  val length: Int = 2
  val func: Func = parseFunc(""""BigInt::bitwiseXOR" (x, y) => {
    app __x0__ = (BigIntBitwiseOp "^" x y)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }""")
}
