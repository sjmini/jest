package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement9HasCallInTailPosition0 extends Algorithm {
  val name: String = "IterationStatement9HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""IterationStatement9HasCallInTailPosition0" (this, ForBinding, AssignmentExpression, Statement, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}