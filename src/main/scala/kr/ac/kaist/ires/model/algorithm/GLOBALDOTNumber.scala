package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumber {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.Number" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    if (! (= argumentsList[0i] absent)) {
      app __x1__ = (ToNumeric value)
      if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let prim = __x1__
      app __x2__ = (Type prim)
      if (= __x2__ BigInt) let n = (convert prim bigint2num ) else let n = prim
    } else let n = 0i
    if (= NewTarget undefined) {
      app __x3__ = (WrapCompletion n)
      return __x3__
    } else {}
    app __x4__ = (OrdinaryCreateFromConstructor NewTarget "%NumberPrototype%" (new ["NumberData"]))
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let O = __x4__
    O["NumberData"] = n
    app __x5__ = (WrapCompletion O)
    return __x5__
  }""")
}
