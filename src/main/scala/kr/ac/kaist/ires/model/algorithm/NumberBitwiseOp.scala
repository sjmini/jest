package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NumberBitwiseOp {
  val length: Int = 3
  val func: Func = parseFunc(""""NumberBitwiseOp" (op, x, y) => {
    app __x0__ = (ToInt32 x)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let lnum = __x0__
    app __x1__ = (ToUint32 y)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let rnum = __x1__
    !!! "Return the result of applying the bitwise operator id:{op} to id:{lnum} and id:{rnum} . The result is a signed 32 - bit integer ."
  }""")
}
