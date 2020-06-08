package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UpdateExpression1HasCallInTailPosition0 extends Algorithm {
  val name: String = "UpdateExpression1HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""UpdateExpression1HasCallInTailPosition0" (this, LeftHandSideExpression, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}