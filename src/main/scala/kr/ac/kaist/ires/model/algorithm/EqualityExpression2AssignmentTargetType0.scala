package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EqualityExpression2AssignmentTargetType0 extends Algorithm {
  val name: String = "EqualityExpression2AssignmentTargetType0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""EqualityExpression2AssignmentTargetType0" (this, EqualityExpression, RelationalExpression) => return CONST_invalid"""), this)
}
