package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedExoticObjectDOTHasProperty {
  val length: Int = 1
  val func: Func = parseFunc(""""IntegerIndexedExoticObject.HasProperty" (O, P) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (Type P)
    if (= __x1__ String) {
      app __x2__ = (CanonicalNumericIndexString P)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let numericIndex = __x2__
      if (! (= numericIndex undefined)) {
        let buffer = O["ViewedArrayBuffer"]
        app __x3__ = (IsDetachedBuffer buffer)
        if (= __x3__ true) {
          app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x4__
        } else {}
        app __x5__ = (IsInteger numericIndex)
        if (= __x5__ false) {
          app __x6__ = (WrapCompletion false)
          return __x6__
        } else {}
        if (== numericIndex -0.0) {
          app __x7__ = (WrapCompletion false)
          return __x7__
        } else {}
        if (< numericIndex 0i) {
          app __x8__ = (WrapCompletion false)
          return __x8__
        } else {}
        if (! (< numericIndex O["ArrayLength"])) {
          app __x9__ = (WrapCompletion false)
          return __x9__
        } else {}
        app __x10__ = (WrapCompletion true)
        return __x10__
      } else {}
    } else {}
    app __x11__ = (OrdinaryHasProperty O P)
    if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    app __x12__ = (WrapCompletion __x11__)
    return __x12__
  }""")
}
