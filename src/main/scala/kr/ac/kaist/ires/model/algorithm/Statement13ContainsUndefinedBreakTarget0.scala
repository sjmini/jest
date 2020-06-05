package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement13ContainsUndefinedBreakTarget0 extends Algorithm {
  val name: String = "Statement13ContainsUndefinedBreakTarget0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Statement13ContainsUndefinedBreakTarget0" (this, DebuggerStatement, labelSet) => return false"""), this)
}
