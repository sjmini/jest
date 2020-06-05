package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GeneratorExpression0Contains1 extends Algorithm {
  val name: String = "GeneratorExpression0Contains1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""GeneratorExpression0Contains1" (this, BindingIdentifier, FormalParameters, GeneratorBody, symbol) => return false"""), this)
}
