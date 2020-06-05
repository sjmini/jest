package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ConciseBody0HasCallInTailPosition0 extends Algorithm {
  val name: String = "ConciseBody0HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ConciseBody0HasCallInTailPosition0" (this, AssignmentExpression, call) => {
    access __x0__ = (AssignmentExpression "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
