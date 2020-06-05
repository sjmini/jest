package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ConditionalExpression1IsFunctionDefinition0 extends Algorithm {
  val name: String = "ConditionalExpression1IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ConditionalExpression1IsFunctionDefinition0" (this, LogicalORExpression, AssignmentExpression0, AssignmentExpression1) => return false"""), this)
}
