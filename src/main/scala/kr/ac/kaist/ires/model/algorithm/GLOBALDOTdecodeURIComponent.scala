package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTdecodeURIComponent extends Algorithm {
  val name: String = "GLOBALDOTdecodeURIComponent"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.decodeURIComponent" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.decodeURIComponent"
  }"""), this)
}
