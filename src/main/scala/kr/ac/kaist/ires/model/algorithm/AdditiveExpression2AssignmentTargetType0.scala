package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AdditiveExpression2AssignmentTargetType0 extends Algorithm {
  val name: String = "AdditiveExpression2AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AdditiveExpression2AssignmentTargetType0" (this, AdditiveExpression, MultiplicativeExpression) => return CONST_invalid"""), this)
}
