package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingElement1HasInitializer0 extends Algorithm {
  val name: String = "BindingElement1HasInitializer0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingElement1HasInitializer0" (this, BindingPattern) => return false"""), this)
}
