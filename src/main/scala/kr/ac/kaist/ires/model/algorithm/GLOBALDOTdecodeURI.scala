package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTdecodeURI extends Algorithm {
  val name: String = "GLOBALDOTdecodeURI"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.decodeURI" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.decodeURI"
  }"""), this)
}
