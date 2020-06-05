package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MemberExpression4IsFunctionDefinition0 extends Algorithm {
  val name: String = "MemberExpression4IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""MemberExpression4IsFunctionDefinition0" (this, SuperProperty) => return false"""), this)
}
