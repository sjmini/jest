package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object EqualityExpression2HasCallInTailPosition0 extends Algorithm {
  val name: String = "EqualityExpression2HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""EqualityExpression2HasCallInTailPosition0" (this, EqualityExpression, RelationalExpression, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}
