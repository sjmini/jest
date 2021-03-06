package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object ResolveBinding extends Algorithm {
  val name: String = "ResolveBinding"
  val length: Int = 1
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""ResolveBinding" (name, env) => {
    if (|| (= env absent) (= env undefined)) env = GLOBAL_context["LexicalEnvironment"] else {}
    assert (= (typeof env) "LexicalEnvironment")
    let strict = true
    app __x0__ = (GetIdentifierReference env name strict)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }"""), this)
}
