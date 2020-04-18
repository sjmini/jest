package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AbstractRelationalComparison {
  val length: Int = 0
  val func: Func = parseFunc(""""AbstractRelationalComparison" (x, y, LeftFirst) => {
    if (= LeftFirst absent) let LeftFirst = true else {}
    if (= LeftFirst true) {
      app __x0__ = (ToPrimitive x Number)
      if (is-completion __x0__) if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let px = __x0__
      app __x1__ = (ToPrimitive y Number)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let py = __x1__
    } else {
      app __x2__ = (ToPrimitive y Number)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let py = __x2__
      app __x3__ = (ToPrimitive x Number)
      if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let px = __x3__
    }
    app __x4__ = (Type px)
    let __x5__ = (= __x4__ String)
    if __x5__ {
      app __x6__ = (Type py)
      __x5__ = (= __x6__ String)
    } else {}
    if __x5__ return (< px py) else {
      app __x7__ = (Type px)
      let __x8__ = (= __x7__ BigInt)
      if __x8__ {
        app __x9__ = (Type py)
        __x8__ = (= __x9__ String)
      } else {}
      if __x8__ {
        app __x10__ = (StringToBigInt py)
        if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        let ny = __x10__
        if (= ny NaN) {
          app __x11__ = (WrapCompletion undefined)
          return __x11__
        } else {}
        access __x12__ = (PRIMITIVES BigInt)
        access __x13__ = (__x12__ "lessThan")
        app __x14__ = (__x13__ px ny)
        app __x15__ = (WrapCompletion __x14__)
        return __x15__
      } else {}
      app __x16__ = (Type px)
      let __x17__ = (= __x16__ String)
      if __x17__ {
        app __x18__ = (Type py)
        __x17__ = (= __x18__ BigInt)
      } else {}
      if __x17__ {
        app __x19__ = (StringToBigInt px)
        if (is-completion __x19__) if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
        let nx = __x19__
        if (= nx NaN) {
          app __x20__ = (WrapCompletion undefined)
          return __x20__
        } else {}
        access __x21__ = (PRIMITIVES BigInt)
        access __x22__ = (__x21__ "lessThan")
        app __x23__ = (__x22__ nx py)
        app __x24__ = (WrapCompletion __x23__)
        return __x24__
      } else {}
      app __x25__ = (ToNumeric px)
      if (is-completion __x25__) if (= __x25__["Type"] CONST_normal) __x25__ = __x25__["Value"] else return __x25__ else {}
      let nx = __x25__
      app __x26__ = (ToNumeric py)
      if (is-completion __x26__) if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
      let ny = __x26__
      app __x27__ = (Type nx)
      app __x28__ = (Type ny)
      if (= __x27__ __x28__) {
        app __x29__ = (Type nx)
        access __x30__ = (PRIMITIVES __x29__)
        access __x31__ = (__x30__ "lessThan")
        app __x32__ = (__x31__ nx ny)
        app __x33__ = (WrapCompletion __x32__)
        return __x33__
      } else {}
      app __x34__ = (Type nx)
      app __x35__ = (Type ny)
      let __x36__ = (&& (= __x34__ BigInt) (= __x35__ Number))
      let __x37__ = (&& (= __x34__ Number) (= __x35__ BigInt))
      let __x38__ = (|| __x36__ __x37__)
      assert __x38__
      if (|| (= nx NaN) (= ny NaN)) return undefined else {}
      if (|| (= nx -Infinity) (= ny Infinity)) {
        app __x39__ = (WrapCompletion true)
        return __x39__
      } else {}
      if (|| (= nx Infinity) (= ny -Infinity)) {
        app __x40__ = (WrapCompletion false)
        return __x40__
      } else {}
      return (< nx ny)
    }
  }""")
}
