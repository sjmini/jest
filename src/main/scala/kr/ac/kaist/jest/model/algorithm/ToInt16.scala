package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ToInt16 extends Algorithm {
  val name: String = "ToInt16"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ToInt16" (argument) => {
    app __x0__ = (ToNumber argument)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let number = __x0__
    if (|| (|| (|| (|| (= number NaN) (= number 0i)) (= number -0.0)) (= number Infinity)) (= number -Infinity)) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    let int = (convert number num2int )
    let int16bit = (%% int 65536i)
    if (! (< int16bit 32768i)) {
      app __x2__ = (WrapCompletion (- int16bit 65536i))
      return __x2__
    } else {
      app __x3__ = (WrapCompletion int16bit)
      return __x3__
    }
  }"""), this)
}
