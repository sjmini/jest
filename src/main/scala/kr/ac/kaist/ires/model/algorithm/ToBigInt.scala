package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToBigInt {
  val func: Func = Func("ToBigInt", List(Id("argument")), None, parseInst(s"""{
    app __x0__ = (ToPrimitive argument "Number")
    if (is-completion __x0__) {
      if (= __x0__.Type CONST_normal) __x0__ = __x0__.Value
      else return __x0__
    } else {}
    let prim = __x0__
    app atype = (Type prim)
    if (= atype "Undefined") return (new Completion (
      "Type" -> CONST_throw,
      "Value" -> (new OrdinaryObject(
        "Prototype" -> INTRINSIC_TypeErrorPrototype,
        "ErrorData" -> undefined,
        "SubMap" -> (new SubMap())
      )),
      "Target" -> CONST_empty
    ))
    else if (= atype "Null") return (new Completion (
      "Type" -> CONST_throw,
      "Value" -> (new OrdinaryObject(
        "Prototype" -> INTRINSIC_TypeErrorPrototype,
        "ErrorData" -> undefined,
        "SubMap" -> (new SubMap())
      )),
      "Target" -> CONST_empty
    ))
    else if (= atype "Boolean") if prim return 1n else return 0n
    else if (= atype "BigInt") return prim
    else if (= atype "Number") return (new Completion (
      "Type" -> CONST_throw,
      "Value" -> (new OrdinaryObject(
        "Prototype" -> INTRINSIC_TypeErrorPrototype,
        "ErrorData" -> undefined,
        "SubMap" -> (new SubMap())
      )),
      "Target" -> CONST_empty
    ))
    else if (= atype "String") {
      app __x1__ = (StringToBigInt prim)
      if (is-completion __x0__) {
        if (= __x1__.Type CONST_normal) __x0__ = __x0__.Value
        else return __x1__
      } else {}
      let n = __x1__
      if (= n NaN) return (new Completion (
        "Type" -> CONST_throw,
        "Value" -> (new OrdinaryObject(
          "Prototype" -> INTRINSIC_SyntaxErrorPrototype,
          "ErrorData" -> undefined,
          "SubMap" -> (new SubMap())
        )),
        "Target" -> CONST_empty
      )) else {}
      return n
    }
    else if (= atype "Symbol") return (new Completion (
      "Type" -> CONST_throw,
      "Value" -> (new OrdinaryObject(
        "Prototype" -> INTRINSIC_TypeErrorPrototype,
        "ErrorData" -> undefined,
        "SubMap" -> (new SubMap())
      )),
      "Target" -> CONST_empty
    )) else {}
  }"""))
}
