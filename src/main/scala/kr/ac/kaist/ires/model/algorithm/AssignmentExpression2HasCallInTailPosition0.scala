package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentExpression2HasCallInTailPosition0 extends Algorithm {
  val name: String = "AssignmentExpression2HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentExpression2HasCallInTailPosition0" (this, ArrowFunction, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}