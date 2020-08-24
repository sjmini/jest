package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CreateDynamicFunction extends Algorithm {
  val name: String = "CreateDynamicFunction"
  val length: Int = 4
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""CreateDynamicFunction" (constructor, newTarget, kind, args) => {
    ??? "CreateDynamicFunction"
  }"""), this)
}
