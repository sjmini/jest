package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyName1IsComputedPropertyKey0 extends Algorithm {
  val name: String = "PropertyName1IsComputedPropertyKey0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""PropertyName1IsComputedPropertyKey0" (this, ComputedPropertyName) => return true"""), this)
}
