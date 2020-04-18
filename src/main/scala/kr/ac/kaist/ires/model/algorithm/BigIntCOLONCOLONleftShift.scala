package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BigIntCOLONCOLONleftShift {
  val length: Int = 2
  val func: Func = parseFunc(""""BigInt::leftShift" (x, y) => {
    if (< y 0n) return (/ (convert x num2bigint ) (** 2n (- (convert y num2bigint )))) else {}
    return (* (convert x num2bigint ) (** 2n (convert y num2bigint )))
  }""")
}
