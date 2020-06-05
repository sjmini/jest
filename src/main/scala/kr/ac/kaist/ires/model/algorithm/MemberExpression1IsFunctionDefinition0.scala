package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MemberExpression1IsFunctionDefinition0 extends Algorithm {
  val name: String = "MemberExpression1IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MemberExpression1IsFunctionDefinition0" (this, MemberExpression, Expression) => return false"""), this)
}
