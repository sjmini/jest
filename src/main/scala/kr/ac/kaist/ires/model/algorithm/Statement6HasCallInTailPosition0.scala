package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement6HasCallInTailPosition0 extends Algorithm {
  val name: String = "Statement6HasCallInTailPosition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Statement6HasCallInTailPosition0" (this, ContinueStatement, call) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }"""), this)
}