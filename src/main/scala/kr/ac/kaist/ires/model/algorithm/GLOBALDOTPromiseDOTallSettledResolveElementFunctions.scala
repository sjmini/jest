package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTPromiseDOTallSettledResolveElementFunctions {
  val length: Int = 0
  val func: Func = parseFunc(""""GLOBAL.Promise.allSettledResolveElementFunctions" (this, argumentsList, NewTarget) => {
    let F = GLOBAL_context["Function"]
    let alreadyCalled = F["AlreadyCalled"]
    if (= alreadyCalled["Value"] true) {
      app __x0__ = (WrapCompletion undefined)
      return __x0__
    } else {}
    alreadyCalled["Value"] = true
    let index = F["Index"]
    let values = F["Values"]
    let promiseCapability = F["Capability"]
    let remainingElementsCount = F["RemainingElements"]
    !!! "Let id:{obj} be ! ObjectCreate ( % Object . prototype % ) ."
    app __x1__ = (CreateDataProperty obj "status" "fulfilled")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (CreateDataProperty obj "value" x)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    !!! "Set id:{values} [ id:{index} ] to be id:{obj} ."
    remainingElementsCount["Value"] = (- remainingElementsCount["Value"] 1i)
    if (= remainingElementsCount["Value"] 0i) {
      app __x3__ = (CreateArrayFromList values)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let valuesArray = __x3__
      app __x4__ = (Call promiseCapability["Resolve"] undefined (new [valuesArray]))
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (WrapCompletion undefined)
    return __x6__
  }""")
}