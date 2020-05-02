package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IntegerIndexedExoticObjectDOTDefineOwnProperty {
  val length: Int = 2
  val func: Func = parseFunc(""""IntegerIndexedExoticObject.DefineOwnProperty" (O, P, Desc) => {
    app __x0__ = (IsPropertyKey P)
    assert (= __x0__ true)
    app __x1__ = (Type P)
    if (= __x1__ String) {
      app __x2__ = (CanonicalNumericIndexString P)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let numericIndex = __x2__
      if (! (= numericIndex undefined)) {
        app __x3__ = (IsInteger numericIndex)
        if (= __x3__ false) {
          app __x4__ = (WrapCompletion false)
          return __x4__
        } else {}
        if (== numericIndex -0.0) {
          app __x5__ = (WrapCompletion false)
          return __x5__
        } else {}
        if (< numericIndex 0i) {
          app __x6__ = (WrapCompletion false)
          return __x6__
        } else {}
        let length = O["ArrayLength"]
        if (! (< numericIndex length)) {
          app __x7__ = (WrapCompletion false)
          return __x7__
        } else {}
        app __x8__ = (IsAccessorDescriptor Desc)
        if (= __x8__ true) {
          app __x9__ = (WrapCompletion false)
          return __x9__
        } else {}
        if (&& (! (= Desc["Configurable"] absent)) (= Desc["Configurable"] true)) {
          app __x10__ = (WrapCompletion false)
          return __x10__
        } else {}
        if (&& (! (= Desc["Enumerable"] absent)) (= Desc["Enumerable"] false)) {
          app __x11__ = (WrapCompletion false)
          return __x11__
        } else {}
        if (&& (! (= Desc["Writable"] absent)) (= Desc["Writable"] false)) {
          app __x12__ = (WrapCompletion false)
          return __x12__
        } else {}
        if (! (= Desc["Value"] absent)) {
          let value = Desc["Value"]
          app __x13__ = (IntegerIndexedElementSet O numericIndex value)
          if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
          app __x14__ = (WrapCompletion __x13__)
          return __x14__
        } else {}
        app __x15__ = (WrapCompletion true)
        return __x15__
      } else {}
    } else {}
    app __x16__ = (OrdinaryDefineOwnProperty O P Desc)
    if (is-completion __x16__) if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
    app __x17__ = (WrapCompletion __x16__)
    return __x17__
  }""")
}
