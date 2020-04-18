package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object HostPrint {
  val func: Func = parseFunc(""""HostPrint" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let str = __x0__
    print str
    app __x1__ = (ToString str)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    str = __x1__
    if (= REALM.printStr absent) {
      REALM.printStr = str
    } else {
      REALM.printStr = (+ REALM.printStr str)
    }
    return undefined
  }""")
}
