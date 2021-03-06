package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object PerformPromiseAll extends Algorithm {
  val name: String = "PerformPromiseAll"
  val length: Int = 3
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""PerformPromiseAll" (iteratorRecord, constructor, resultCapability) => {
    app __x0__ = (IsConstructor constructor)
    assert (= __x0__ true)
    let values = (new [])
    let remainingElementsCount = (new Record("Value" -> 1i))
    app __x1__ = (Get constructor "resolve")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promiseResolve = __x1__
    app __x2__ = (IsCallable promiseResolve)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    if (= __x2__ false) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    let index = 0i
    while true {
      app __x4__ = (IteratorStep iteratorRecord)
      let next = __x4__
      app __x5__ = (IsAbruptCompletion next)
      if __x5__ iteratorRecord["Done"] = true else {}
      if (is-completion next) if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) {
        iteratorRecord["Done"] = true
        remainingElementsCount["Value"] = (- remainingElementsCount["Value"] 1i)
        if (= remainingElementsCount["Value"] 0i) {
          app __x6__ = (CreateArrayFromList values)
          if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          let valuesArray = __x6__
          app __x7__ = (Call resultCapability["Resolve"] undefined (new [valuesArray]))
          if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          __x7__
        } else {}
        app __x8__ = (WrapCompletion resultCapability["Promise"])
        return __x8__
      } else {}
      app __x9__ = (IteratorValue next)
      let nextValue = __x9__
      app __x10__ = (IsAbruptCompletion nextValue)
      if __x10__ iteratorRecord["Done"] = true else {}
      if (is-completion nextValue) if (= nextValue["Type"] CONST_normal) nextValue = nextValue["Value"] else return nextValue else {}
      nextValue
      append undefined -> values
      app __x11__ = (Call promiseResolve constructor (new [nextValue]))
      if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let nextPromise = __x11__
      let steps = (new algorithm ("length" -> 1i, "step" -> GLOBALDOTPromiseDOTallResolveElementFunctions))
      app __x12__ = (CreateBuiltinFunction steps (new ["AlreadyCalled", "Index", "Values", "Capability", "RemainingElements"]))
      if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let resolveElement = __x12__
      resolveElement["AlreadyCalled"] = (new Record("Value" -> false))
      resolveElement["Index"] = index
      resolveElement["Values"] = values
      resolveElement["Capability"] = resultCapability
      resolveElement["RemainingElements"] = remainingElementsCount
      remainingElementsCount["Value"] = (+ remainingElementsCount["Value"] 1i)
      app __x13__ = (Invoke nextPromise "then" (new [resolveElement, resultCapability["Reject"]]))
      if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
      __x13__
      index = (+ index 1i)
    }
  }"""), this)
}
