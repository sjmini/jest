package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedElementSet {
  val length: Int = 3
  val func: Func = parseFunc(""""IntegerIndexedElementSet" (O, index, value) => {
    app __x0__ = (Type index)
    assert (= __x0__ Number)
    if (= O["ContentType"] "BigInt") {
      app __x1__ = (ToBigInt value)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let numValue = __x1__
    } else {
      app __x2__ = (ToNumber value)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let numValue = __x2__
    }
    let buffer = O["ViewedArrayBuffer"]
    app __x3__ = (IsDetachedBuffer buffer)
    if (= __x3__ true) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    app __x5__ = (IsInteger index)
    if (= __x5__ false) {
      app __x6__ = (WrapCompletion false)
      return __x6__
    } else {}
    if (== index -0.0) {
      app __x7__ = (WrapCompletion false)
      return __x7__
    } else {}
    let length = O["ArrayLength"]
    if (|| (< index 0i) (! (< index length))) {
      app __x8__ = (WrapCompletion false)
      return __x8__
    } else {}
    let offset = O["ByteOffset"]
    let arrayTypeName = O["TypedArrayName"]
    !!! "Let id:{elementSize} be the Number value of the Element Size value specified in Table 61 for id:{arrayTypeName} ."
    let indexedPosition = (+ (* index elementSize) offset)
    !!! "Let id:{elementType} be the String value of the Element Type value in Table 61 for id:{arrayTypeName} ."
    app __x9__ = (SetValueInBuffer buffer indexedPosition elementType numValue true "Unordered")
    __x9__
    app __x10__ = (WrapCompletion true)
    return __x10__
  }""")
}
