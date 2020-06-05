package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ShiftExpression3AssignmentTargetType0 extends Algorithm {
  val name: String = "ShiftExpression3AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ShiftExpression3AssignmentTargetType0" (this, ShiftExpression, AdditiveExpression) => return CONST_invalid"""), this)
}
