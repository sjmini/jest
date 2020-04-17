package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONunsignedRightShift {
  val length: Int = 2
  val func: Func = parseFunc(""""BigInt::unsignedRightShift" (x, y) => {
    app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
    return __x0__
  }""")
}
