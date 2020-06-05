package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Expression1IsFunctionDefinition0 extends Algorithm {
  val name: String = "Expression1IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""Expression1IsFunctionDefinition0" (this, Expression, AssignmentExpression) => return false"""), this)
}
