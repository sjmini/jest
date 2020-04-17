package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONexponentiate {
  val length: Int = 2
  val func: Func = parseFunc(""""BigInt::exponentiate" (base, exponent) => {
    if (< exponent !!! "0n") {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    if (&& (= base !!! "0n") (= exponent !!! "0n")) {
      app __x1__ = (WrapCompletion !!! "1n")
      return __x1__
    } else {}
    !!! "Return the BigInt value that represents the mathematical value of id:{base} raised to the power id:{exponent} ."
  }""")
}
