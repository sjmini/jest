package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Statement7ContainsUndefinedContinueTarget0 extends Algorithm {
  val name: String = "Statement7ContainsUndefinedContinueTarget0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Statement7ContainsUndefinedContinueTarget0" (this, BreakStatement, iterationSet, labelSet) => return false"""), this)
}
