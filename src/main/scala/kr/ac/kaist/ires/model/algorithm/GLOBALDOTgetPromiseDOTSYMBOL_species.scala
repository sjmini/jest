package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTgetPromiseDOTSYMBOL_species extends Algorithm {
  val name: String = "GLOBALDOTgetPromiseDOTSYMBOL_species"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.getPromise.SYMBOL_species" (this, argumentsList, NewTarget) => {
    app __x0__ = (WrapCompletion this)
    return __x0__
  }"""), this)
}
