package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FunctionExpression0IsFunctionDefinition0 extends Algorithm {
  val name: String = "FunctionExpression0IsFunctionDefinition0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionExpression0IsFunctionDefinition0" (this, FormalParameters, FunctionBody) => return true"""), this)
}
