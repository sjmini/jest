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
    let __x31__ = (|| (|| (= __x30__ String) (= __x30__ Number)) (= __x30__ Symbol))
    if __x31__ {
      app __x32__ = (Type y)
      __x31__ = (= __x32__ Object)
    } else {}
    if __x31__ {
      app __x33__ = (ToPrimitive y)
      if (is-completion __x33__) if (= __x33__["Type"] CONST_normal) __x33__ = __x33__["Value"] else return __x33__ else {}
      app __x34__ = (AbstractEqualityComparison x __x33__)
      app __x35__ = (WrapCompletion __x34__)
      return __x35__
    } else {}
    app __x36__ = (Type x)
    let __x37__ = (= __x36__ Object)
    if __x37__ {
      app __x38__ = (Type y)
      __x37__ = (|| (|| (= __x38__ String) (= __x38__ Number)) (= __x38__ Symbol))
    } else {}
    if __x37__ {
      app __x39__ = (ToPrimitive x)
      if (is-completion __x39__) if (= __x39__["Type"] CONST_normal) __x39__ = __x39__["Value"] else return __x39__ else {}
      app __x40__ = (AbstractEqualityComparison __x39__ y)
      app __x41__ = (WrapCompletion __x40__)
      return __x41__
    } else {}
    app __x42__ = (Type x)
    let __x43__ = (|| (|| (|| (= __x42__ String) (= __x42__ Number)) (= __x42__ BigInt)) (= __x42__ Symbol))
    if __x43__ {
      app __x44__ = (Type y)
      __x43__ = (= __x44__ Object)
    } else {}
    if __x43__ {
      app __x45__ = (ToPrimitive y)
      app __x46__ = (AbstractEqualityComparison x __x45__)
      app __x47__ = (WrapCompletion __x46__)
      return __x47__
    } else {}
    app __x48__ = (Type x)
    let __x49__ = (= __x48__ Object)
    if __x49__ {
      app __x50__ = (Type y)
      __x49__ = (|| (|| (|| (= __x50__ String) (= __x50__ Number)) (= __x50__ BigInt)) (= __x50__ Symbol))
    } else {}
    if __x49__ {
      app __x51__ = (ToPrimitive x)
      app __x52__ = (AbstractEqualityComparison __x51__ y)
      app __x53__ = (WrapCompletion __x52__)
      return __x53__
    } else {}
    app __x54__ = (Type x)
    let __x55__ = (= __x54__ BigInt)
    if __x55__ {
      app __x56__ = (Type y)
      let __x57__ = (= __x56__ Number)
      if __x57__ {} else {
        app __x58__ = (Type x)
        let __x59__ = (= __x58__ Number)
        if __x59__ {
          app __x60__ = (Type y)
          __x59__ = (= __x60__ BigInt)
        } else {}
        __x57__ = __x59__
      }
      __x55__ = __x57__
    } else {}
    if __x55__ {
      !!! "If id:{x} or id:{y} are any of value:{NaN} , value:{+∞} , or value:{-∞} , return value:{false} ."
      !!! "If the mathematical value of id:{x} is equal to the mathematical value of id:{y} , return value:{true} ; otherwise return value:{false} ."
    } else {}
    app __x61__ = (WrapCompletion false)
    return __x61__
  }""")
}
