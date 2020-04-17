package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONleftShift {
  val length: Int = 2
  val func: Func = parseFunc(""""BigInt::leftShift" (x, y) => {
    if (< y !!! "0n") !!! "Return the BigInt value that represents id:{x} ÷ 2 sup:{- id:{y} } , rounding down to the nearest integer , including for negative numbers ." else {}
    !!! "Return the BigInt value that represents id:{x} × 2 sup:{id:{y} } ."
  }""")
}
