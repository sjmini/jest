package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object FunctionDeclaration0BoundNames0 extends Algorithm {
  val name: String = "FunctionDeclaration0BoundNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""FunctionDeclaration0BoundNames0" (this, BindingIdentifier, FormalParameters, FunctionBody) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }"""), this)
}
