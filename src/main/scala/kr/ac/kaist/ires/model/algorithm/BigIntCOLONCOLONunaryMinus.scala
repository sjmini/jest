package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONunaryMinus {
  val length: Int = 1
  val func: Func = parseFunc(""""BigInt::unaryMinus" (x) => {
    if (= x !!! "0n") {
      app __x0__ = (WrapCompletion !!! "0n")
      return __x0__
    } else {}
    !!! "Return the BigInt value that represents the mathematical value of negating id:{x} ."
  }""")
}
