package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFunctionExpression1Evaluation0 extends Algorithm {
  val name: String = "AsyncFunctionExpression1Evaluation0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""AsyncFunctionExpression1Evaluation0" (this, BindingIdentifier, FormalParameters, AsyncFunctionBody) => {
    if true let strict = true else let strict = false
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    app __x1__ = (NewDeclarativeEnvironment scope)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let funcEnv = __x1__
    let envRec = funcEnv["EnvironmentRecord"]
    access __x2__ = (BindingIdentifier "StringValue")
    let name = __x2__
    app __x3__ = (envRec["CreateImmutableBinding"] envRec name)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    app __x4__ = (AsyncFunctionCreate CONST_Normal FormalParameters AsyncFunctionBody funcEnv strict)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let closure = __x4__
    app __x5__ = (SetFunctionName closure name)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    __x5__
    app __x6__ = (envRec["InitializeBinding"] envRec name closure)
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    __x6__
    closure["SourceText"] = (get-syntax this)
    app __x7__ = (WrapCompletion closure)
    return __x7__
  }"""), this)
}
