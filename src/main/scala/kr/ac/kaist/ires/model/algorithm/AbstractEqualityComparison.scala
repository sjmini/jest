package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AbstractEqualityComparison {
  val length: Int = 0
  val func: Func = parseFunc(""""AbstractEqualityComparison" (x, y) => {
    app __x0__ = (Type x)
    app __x1__ = (Type y)
    if (= __x0__ __x1__) {
      app __x2__ = (StrictEqualityComparison x y)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    if (&& (= x null) (= y undefined)) {
      app __x4__ = (WrapCompletion true)
      return __x4__
    } else {}
    if (&& (= x undefined) (= y null)) {
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    app __x6__ = (Type x)
    let __x7__ = (= __x6__ Number)
    if __x7__ {
      app __x8__ = (Type y)
      __x7__ = (= __x8__ String)
    } else {}
    if __x7__ {
      app __x9__ = (ToNumber y)
      if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      app __x10__ = (AbstractEqualityComparison x __x9__)
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    app __x12__ = (Type x)
    let __x13__ = (= __x12__ String)
    if __x13__ {
      app __x14__ = (Type y)
      __x13__ = (= __x14__ Number)
    } else {}
    if __x13__ {
      app __x15__ = (ToNumber x)
      if (is-completion __x15__) if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      app __x16__ = (AbstractEqualityComparison __x15__ y)
      app __x17__ = (WrapCompletion __x16__)
      return __x17__
    } else {}
    app __x18__ = (Type x)
    let __x19__ = (= __x18__ BigInt)
    if __x19__ {
      app __x20__ = (Type y)
      __x19__ = (= __x20__ String)
    } else {}
    if __x19__ {
      app __x21__ = (StringToBigInt y)
      if (is-completion __x21__) if (= __x21__["Type"] CONST_normal) __x21__ = __x21__["Value"] else return __x21__ else {}
      let n = __x21__
      if (= n NaN) {
        app __x22__ = (WrapCompletion false)
        return __x22__
      } else {}
      app __x23__ = (AbstractEqualityComparison x n)
      app __x24__ = (WrapCompletion __x23__)
      return __x24__
    } else {}
    app __x25__ = (Type x)
    let __x26__ = (= __x25__ String)
    if __x26__ {
      app __x27__ = (Type y)
      __x26__ = (= __x27__ BigInt)
    } else {}
    if __x26__ {
      app __x28__ = (AbstractEqualityComparison y x)
      app __x29__ = (WrapCompletion __x28__)
      return __x29__
    } else {}
    app __x30__ = (Type x)
    if (= __x30__ Boolean) {
      app __x31__ = (ToNumber x)
      if (is-completion __x31__) if (= __x31__["Type"] CONST_normal) __x31__ = __x31__["Value"] else return __x31__ else {}
      app __x32__ = (AbstractEqualityComparison __x31__ y)
      app __x33__ = (WrapCompletion __x32__)
      return __x33__
    } else {}
    app __x34__ = (Type y)
    if (= __x34__ Boolean) {
      app __x35__ = (ToNumber y)
      if (is-completion __x35__) if (= __x35__["Type"] CONST_normal) __x35__ = __x35__["Value"] else return __x35__ else {}
      app __x36__ = (AbstractEqualityComparison x __x35__)
      app __x37__ = (WrapCompletion __x36__)
      return __x37__
    } else {}
    app __x38__ = (Type x)
    let __x39__ = (|| (|| (|| (= __x38__ String) (= __x38__ Number)) (= __x38__ BigInt)) (= __x38__ Symbol))
    if __x39__ {
      app __x40__ = (Type y)
      __x39__ = (= __x40__ Object)
    } else {}
    if __x39__ {
      app __x41__ = (ToPrimitive y)
      app __x42__ = (AbstractEqualityComparison x __x41__)
      app __x43__ = (WrapCompletion __x42__)
      return __x43__
    } else {}
    app __x44__ = (Type x)
    let __x45__ = (= __x44__ Object)
    if __x45__ {
      app __x46__ = (Type y)
      __x45__ = (|| (|| (|| (= __x46__ String) (= __x46__ Number)) (= __x46__ BigInt)) (= __x46__ Symbol))
    } else {}
    if __x45__ {
      app __x47__ = (ToPrimitive x)
      app __x48__ = (AbstractEqualityComparison __x47__ y)
      app __x49__ = (WrapCompletion __x48__)
      return __x49__
    } else {}
    app __x50__ = (Type x)
    app __x51__ = (Type y)
    let __x52__ = (&& (= __x50__ BigInt) (= __x51__ Number))
    let __x53__ = (&& (= __x50__ Number) (= __x51__ BigInt))
    let __x54__ = (|| __x52__ __x53__)
    if __x54__ {
      if (|| (|| (= x NaN) (|| (= x Infinity) (= x Infinity))) (|| (= y NaN) (|| (= y Infinity) (= y Infinity)))) return false else {}
      if (= x y) return true else return false
    } else {}
    app __x55__ = (WrapCompletion false)
    return __x55__
  }""")
}
