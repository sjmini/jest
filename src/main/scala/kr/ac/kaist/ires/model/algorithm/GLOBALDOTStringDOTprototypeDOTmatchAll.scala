package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTStringDOTprototypeDOTmatchAll {
  val length: Int = 1
  val func: Func = parseFunc(""""GLOBAL.String.prototype.matchAll" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let regexp = __x0__
    app __x1__ = (RequireObjectCoercible this)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    if (! (|| (= regexp undefined) (= regexp null))) {
      app __x2__ = (GetMethod regexp SYMBOL_matchAll)
      if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let matcher = __x2__
      if (! (= matcher undefined)) {
        app __x3__ = (Call matcher regexp (new [O]))
        if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        app __x4__ = (WrapCompletion __x3__)
        return __x4__
      } else {}
    } else {}
    app __x5__ = (ToString O)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let S = __x5__
    app __x6__ = (RegExpCreate regexp "g")
    if (is-completion __x6__) if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let rx = __x6__
    app __x7__ = (Invoke rx SYMBOL_matchAll (new [S]))
    if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }""")
}
