package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTAwaitRejectedFunctions extends Algorithm {
  val name: String = "GLOBALDOTAwaitRejectedFunctions"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.AwaitRejectedFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let reason = __x0__
    let F = GLOBAL_context["Function"]
    let asyncContext = F["AsyncContext"]
    let prevContext = GLOBAL_context
    append asyncContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x1__ = (ThrowCompletion reason)
    withcont __x2__ () ={
      if (= asyncContext["ReturnCont"] absent) asyncContext["ReturnCont"] = (new []) else {}
      append __x2__ -> asyncContext["ReturnCont"]
      app __x3__ = (asyncContext["ResumeCont"] __x1__)
    }
    app __x4__ = (WrapCompletion undefined)
    return __x4__
  }"""), this)
}
