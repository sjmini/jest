package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFunctionDeclaration1BoundNames0 extends Algorithm {
  val name: String = "AsyncFunctionDeclaration1BoundNames0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncFunctionDeclaration1BoundNames0" (this, FormalParameters, AsyncFunctionBody) => return (new ["*default*"])"""), this)
}
