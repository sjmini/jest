package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTBigIntDOTprototypeDOTvalueOf extends Algorithm {
  val name: String = "GLOBALDOTBigIntDOTprototypeDOTvalueOf"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.BigInt.prototype.valueOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (thisBigIntValue this)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
