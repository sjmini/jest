package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTprototypeDOTtoFixed extends Algorithm {
  val name: String = "GLOBALDOTNumberDOTprototypeDOTtoFixed"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Number.prototype.toFixed" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.Number.prototype.toFixed"
  }"""), this)
}
