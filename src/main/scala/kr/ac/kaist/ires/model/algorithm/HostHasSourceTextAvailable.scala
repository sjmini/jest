package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object HostHasSourceTextAvailable extends Algorithm {
  val name: String = "HostHasSourceTextAvailable"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""HostHasSourceTextAvailable" (func) => {
    return (new Completion("Type" -> CONST_normal, "Value" -> true, "Target" -> CONST_empty))
  }"""), this)
}
