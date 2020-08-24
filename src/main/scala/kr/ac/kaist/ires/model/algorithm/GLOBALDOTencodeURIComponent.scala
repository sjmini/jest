package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTencodeURIComponent extends Algorithm {
  val name: String = "GLOBALDOTencodeURIComponent"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.encodeURIComponent" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.encodeURIComponent"
  }"""), this)
}
