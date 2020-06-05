package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BitwiseANDExpression1HasCallInTailPosition0 extends Algorithm {
  val name: String = "BitwiseANDExpression1HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BitwiseANDExpression1HasCallInTailPosition0" (this, BitwiseANDExpression, EqualityExpression, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}
