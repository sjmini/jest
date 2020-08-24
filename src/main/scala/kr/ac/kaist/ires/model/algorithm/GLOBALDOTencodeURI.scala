package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTencodeURI extends Algorithm {
  val name: String = "GLOBALDOTencodeURI"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.encodeURI" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.encodeURI"
  }"""), this)
}
