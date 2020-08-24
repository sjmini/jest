package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTtoLowerCase extends Algorithm {
  val name: String = "GLOBALDOTStringDOTprototypeDOTtoLowerCase"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.prototype.toLowerCase" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.String.prototype.toLowerCase"
  }"""), this)
}
