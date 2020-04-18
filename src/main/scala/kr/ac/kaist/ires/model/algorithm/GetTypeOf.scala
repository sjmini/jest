package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetTypeOf {
  val func: Func = parseFunc(""""GetTypeOf" (argument) => {
    let t = (typeof argument)
    if (= t "Undefined") return "undefined"
    else if (= t "Null") return "object"
    else if (= t "Boolean") return "boolean"
    else if (= t "Number") return "number"
    else if (= t "String") return "string"
    else if (= t "Symbol") return "symbol"
    else if (= t "BigInt") return "bigint"
    else {
      if (= argument.Call absent) return "object"
      else return "function"
    }
  }""")
}
