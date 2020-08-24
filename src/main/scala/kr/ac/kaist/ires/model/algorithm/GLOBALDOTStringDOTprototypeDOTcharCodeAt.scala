package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTcharCodeAt extends Algorithm {
  val name: String = "GLOBALDOTStringDOTprototypeDOTcharCodeAt"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.prototype.charCodeAt" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.String.prototype.charCodeAt"
  }"""), this)
}
