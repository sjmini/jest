package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ForBinding1IsDestructuring0 extends Algorithm {
  val name: String = "ForBinding1IsDestructuring0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ForBinding1IsDestructuring0" (this, BindingPattern) => return true"""), this)
}
