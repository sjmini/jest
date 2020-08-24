package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTfromCodePoint extends Algorithm {
  val name: String = "GLOBALDOTStringDOTfromCodePoint"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.fromCodePoint" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.String.fromCodePoint"
  }"""), this)
}
