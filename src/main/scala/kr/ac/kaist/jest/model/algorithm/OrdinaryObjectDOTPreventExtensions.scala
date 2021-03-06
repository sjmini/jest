package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object OrdinaryObjectDOTPreventExtensions extends Algorithm {
  val name: String = "OrdinaryObjectDOTPreventExtensions"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""OrdinaryObject.PreventExtensions" (O) => {
    app __x0__ = (OrdinaryPreventExtensions O)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
