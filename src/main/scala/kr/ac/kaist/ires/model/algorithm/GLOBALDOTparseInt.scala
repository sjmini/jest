package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTparseInt extends Algorithm {
  val name: String = "GLOBALDOTparseInt"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.parseInt" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.parseInt"
  }"""), this)
}
