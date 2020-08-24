package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTfromCharCode extends Algorithm {
  val name: String = "GLOBALDOTStringDOTfromCharCode"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.fromCharCode" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.String.fromCharCode"
  }"""), this)
}
