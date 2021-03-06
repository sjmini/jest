package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTAsyncGeneratorResumeNextReturnProcessorFulfilledFunctions extends Algorithm {
  val name: String = "GLOBALDOTAsyncGeneratorResumeNextReturnProcessorFulfilledFunctions"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.AsyncGeneratorResumeNextReturnProcessorFulfilledFunctions" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let F = GLOBAL_context["Function"]
    F["Generator"]["AsyncGeneratorState"] = CONST_completed
    app __x1__ = (AsyncGeneratorResolve F["Generator"] value true)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }"""), this)
}
