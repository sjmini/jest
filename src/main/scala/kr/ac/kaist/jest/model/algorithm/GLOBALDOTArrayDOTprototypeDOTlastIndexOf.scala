package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTlastIndexOf extends Algorithm {
  val name: String = "GLOBALDOTArrayDOTprototypeDOTlastIndexOf"
  val length: Int = 1
  val lang: Boolean = false
  val func: Func = FixUIdWalker(parseFunc(""""GLOBAL.Array.prototype.lastIndexOf" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let searchElement = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let fromIndex = __x1__
    app __x2__ = (ToObject this)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    if (= len 0i) {
      app __x4__ = (WrapCompletion (- 1i))
      return __x4__
    } else {}
    if (! (= argumentsList[1i] absent)) {
      app __x5__ = (ToInteger fromIndex)
      if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let n = __x5__
    } else let n = (- len 1i)
    if (! (< n 0i)) {
      app __x6__ = (min n (- len 1i))
      let k = __x6__
    } else let k = (+ len n)
    while (! (< k 0i)) {
      app __x7__ = (ToString k)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      app __x8__ = (HasProperty O __x7__)
      if (is-completion __x8__) if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let kPresent = __x8__
      if (= kPresent true) {
        app __x9__ = (ToString k)
        if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        app __x10__ = (Get O __x9__)
        if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        let elementK = __x10__
        app __x11__ = (StrictEqualityComparison searchElement elementK)
        let same = __x11__
        if (= same true) {
          app __x12__ = (WrapCompletion k)
          return __x12__
        } else {}
      } else {}
      k = (- k 1i)
    }
    app __x13__ = (WrapCompletion (- 1i))
    return __x13__
  }"""), this)
}
