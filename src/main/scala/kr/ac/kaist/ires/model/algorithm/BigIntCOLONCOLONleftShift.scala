package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONleftShift {
  val length: Int = 2
  val func: Func = parseFunc(""""BigInt::leftShift" (x, y) => {
    if (< y 0n) return (/ x (** 2n (- y))) else {}
    return (* x (** 2n y))
  }""")
}
