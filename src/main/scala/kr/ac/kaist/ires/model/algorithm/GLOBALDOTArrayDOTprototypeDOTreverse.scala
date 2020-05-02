package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTreverse {
  val length: Int = 0
  val func: Func = parseFunc(""""GLOBAL.Array.prototype.reverse" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (Get O "length")
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToLength __x1__)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let len = __x2__
    app __x3__ = (floor (/ len 2i))
    let middle = __x3__
    let lower = 0i
    while (! (== lower middle)) {
      let upper = (- (- len lower) 1i)
      app __x4__ = (ToString upper)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let upperP = __x4__
      app __x5__ = (ToString lower)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let lowerP = __x5__
      app __x6__ = (HasProperty O lowerP)
      if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let lowerExists = __x6__
      if (= lowerExists true) {
        app __x7__ = (Get O lowerP)
        if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let lowerValue = __x7__
      } else {}
      app __x8__ = (HasProperty O upperP)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let upperExists = __x8__
      if (= upperExists true) {
        app __x9__ = (Get O upperP)
        if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        let upperValue = __x9__
      } else {}
      if (&& (= lowerExists true) (= upperExists true)) {
        app __x10__ = (Set O lowerP upperValue true)
        if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        __x10__
        app __x11__ = (Set O upperP lowerValue true)
        if (is-completion __x11__) if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
        __x11__
      } else if (&& (= lowerExists false) (= upperExists true)) {
        app __x12__ = (Set O lowerP upperValue true)
        if (is-completion __x12__) if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
        __x12__
        app __x13__ = (DeletePropertyOrThrow O upperP)
        if (is-completion __x13__) if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        __x13__
      } else if (&& (= lowerExists true) (= upperExists false)) {
        app __x14__ = (DeletePropertyOrThrow O lowerP)
        if (is-completion __x14__) if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        __x14__
        app __x15__ = (Set O upperP lowerValue true)
        if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
        __x15__
      } else !!! "Etc"
      lower = (+ lower 1i)
    }
    app __x16__ = (WrapCompletion O)
    return __x16__
  }""")
}
