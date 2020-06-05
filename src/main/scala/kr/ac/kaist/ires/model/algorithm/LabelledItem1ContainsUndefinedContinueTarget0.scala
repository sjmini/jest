package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LabelledItem1ContainsUndefinedContinueTarget0 extends Algorithm {
  val name: String = "LabelledItem1ContainsUndefinedContinueTarget0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""LabelledItem1ContainsUndefinedContinueTarget0" (this, FunctionDeclaration, iterationSet, labelSet) => return false"""), this)
}
