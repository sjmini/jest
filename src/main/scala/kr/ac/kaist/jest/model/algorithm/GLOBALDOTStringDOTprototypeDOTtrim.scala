package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTtrim extends Algorithm {
  val name: String = "GLOBALDOTStringDOTprototypeDOTtrim"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.prototype.trim" (this, argumentsList, NewTarget) => {
    let S = this
    app __x0__ = (TrimString S CONST_startPLUSend)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
