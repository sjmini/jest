package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseBlock0ContainsUndefinedBreakTarget0 extends Algorithm {
  val name: String = "CaseBlock0ContainsUndefinedBreakTarget0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""CaseBlock0ContainsUndefinedBreakTarget0" (this, labelSet) => return false"""), this)
}
