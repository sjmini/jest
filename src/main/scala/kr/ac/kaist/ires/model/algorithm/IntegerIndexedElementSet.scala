package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedElementSet {
  val length: Int = 3
  val func: Func = parseFunc(""""IntegerIndexedElementSet" (O, index, value) => {
    app __x0__ = (Type index)
    assert (= __x0__ Number)
    app __x1__ = (ToNumber value)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let numValue = __x1__
    let buffer = O["ViewedArrayBuffer"]
    app __x2__ = (IsDetachedBuffer buffer)
    if (= __x2__ true) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    app __x4__ = (IsInteger index)
    if (= __x4__ false) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {}
    if (= index -0.0) {
      app __x6__ = (WrapCompletion false)
      return __x6__
    } else {}
    let length = O["ArrayLength"]
    if (|| (< index 0i) (! (< index length))) {
      app __x7__ = (WrapCompletion false)
      return __x7__
    } else {}
    let offset = O["ByteOffset"]
    let arrayTypeName = O["TypedArrayName"]
    !!! "Let id:{elementSize} be the Number value of the Element Size value specified in Table 60 for id:{arrayTypeName} ."
    let indexedPosition = (+ (* index elementSize) offset)
    !!! "Let id:{elementType} be the String value of the Element Type value in Table 60 for id:{arrayTypeName} ."
    app __x8__ = (SetValueInBuffer buffer indexedPosition elementType numValue true "Unordered")
    __x8__
    app __x9__ = (WrapCompletion true)
    return __x9__
  }""")
}
