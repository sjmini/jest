package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTparseFloat extends Algorithm {
  val name: String = "GLOBALDOTparseFloat"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.parseFloat" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.parseFloat"
  }"""), this)
}
