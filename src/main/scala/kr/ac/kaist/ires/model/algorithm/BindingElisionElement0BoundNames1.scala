package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingElisionElement0BoundNames1 extends Algorithm {
  val name: String = "BindingElisionElement0BoundNames1"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingElisionElement0BoundNames1" (this, Elision, BindingElement) => {
    access __x0__ = (BindingElement "BoundNames")
    return __x0__
  }"""), this)
}
