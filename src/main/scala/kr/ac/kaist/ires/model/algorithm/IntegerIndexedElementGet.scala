package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedElementGet {
  val length: Int = 2
  val func: Func = parseFunc(""""IntegerIndexedElementGet" (O, index) => {
    app __x0__ = (Type index)
    assert (= __x0__ Number)
    let buffer = O["ViewedArrayBuffer"]
    app __x1__ = (IsDetachedBuffer buffer)
    if (= __x1__ true) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    app __x3__ = (IsInteger index)
    if (= __x3__ false) {
      app __x4__ = (WrapCompletion undefined)
      return __x4__
    } else {}
    if (== index -0.0) {
      app __x5__ = (WrapCompletion undefined)
      return __x5__
    } else {}
    let length = O["ArrayLength"]
    if (|| (< index 0i) (! (< index length))) {
      app __x6__ = (WrapCompletion undefined)
      return __x6__
    } else {}
    let offset = O["ByteOffset"]
    let arrayTypeName = O["TypedArrayName"]
    !!! "Let id:{elementSize} be the Number value of the Element Size value specified in Table 61 for id:{arrayTypeName} ."
    let indexedPosition = (+ (* index elementSize) offset)
    !!! "Let id:{elementType} be the String value of the Element Type value in Table 61 for id:{arrayTypeName} ."
    app __x7__ = (GetValueFromBuffer buffer indexedPosition elementType true "Unordered")
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }""")
}
