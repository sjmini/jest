package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object RelationalExpression5IsFunctionDefinition0 extends Algorithm {
  val name: String = "RelationalExpression5IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""RelationalExpression5IsFunctionDefinition0" (this, RelationalExpression, ShiftExpression) => return false"""), this)
}
