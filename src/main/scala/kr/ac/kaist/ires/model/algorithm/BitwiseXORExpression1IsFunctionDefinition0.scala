package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BitwiseXORExpression1IsFunctionDefinition0 extends Algorithm {
  val name: String = "BitwiseXORExpression1IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BitwiseXORExpression1IsFunctionDefinition0" (this, BitwiseXORExpression, BitwiseANDExpression) => return false"""), this)
}
