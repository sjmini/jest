package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTreplace extends Algorithm {
  val name: String = "GLOBALDOTStringDOTprototypeDOTreplace"
  val length: Int = 2
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.prototype.replace" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.String.prototype.replace"
  }"""), this)
}
