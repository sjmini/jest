package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameters4ExpectedArgumentCount0 extends Algorithm {
  val name: String = "FormalParameters4ExpectedArgumentCount0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FormalParameters4ExpectedArgumentCount0" (this, FormalParameterList, FunctionRestParameter) => {
    access __x0__ = (FormalParameterList "ExpectedArgumentCount")
    return __x0__
  }"""), this)
}
