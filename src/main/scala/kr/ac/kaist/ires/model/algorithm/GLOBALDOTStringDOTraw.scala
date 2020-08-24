package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTraw extends Algorithm {
  val name: String = "GLOBALDOTStringDOTraw"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.raw" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.String.raw"
  }"""), this)
}
