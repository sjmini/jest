package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object AssignmentExpression5HasCallInTailPosition0 extends Algorithm {
  val name: String = "AssignmentExpression5HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AssignmentExpression5HasCallInTailPosition0" (this, LeftHandSideExpression, AssignmentOperator, AssignmentExpression, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}
