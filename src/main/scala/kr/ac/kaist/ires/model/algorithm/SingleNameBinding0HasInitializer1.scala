package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SingleNameBinding0HasInitializer1 extends Algorithm {
  val name: String = "SingleNameBinding0HasInitializer1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""SingleNameBinding0HasInitializer1" (this, BindingIdentifier, Initializer) => return true"""), this)
}
