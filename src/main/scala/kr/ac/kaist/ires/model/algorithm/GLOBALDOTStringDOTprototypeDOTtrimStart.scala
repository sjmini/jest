package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTtrimStart extends Algorithm {
  val name: String = "GLOBALDOTStringDOTprototypeDOTtrimStart"
  val length: Int = 0
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.String.prototype.trimStart" (this, argumentsList, NewTarget) => {
    ??? "GLOBAL.String.prototype.trimStart"

    let S = this
    app __x0__ = (TrimString S CONST_start)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
