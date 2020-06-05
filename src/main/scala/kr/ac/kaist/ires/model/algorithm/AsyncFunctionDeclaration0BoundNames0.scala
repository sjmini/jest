package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFunctionDeclaration0BoundNames0 extends Algorithm {
  val name: String = "AsyncFunctionDeclaration0BoundNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncFunctionDeclaration0BoundNames0" (this, BindingIdentifier, FormalParameters, AsyncFunctionBody) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }"""), this)
}
