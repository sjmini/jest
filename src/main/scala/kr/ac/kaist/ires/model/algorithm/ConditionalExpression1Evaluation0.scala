package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ConditionalExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""ConditionalExpression1Evaluation0" (this, ShortCircuitExpression, AssignmentExpression0, AssignmentExpression1) => {
    access __x0__ = (ShortCircuitExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToBoolean __x1__)
    let lval = __x2__
    if (= lval true) {
      access __x3__ = (AssignmentExpression0 "Evaluation")
      let trueRef = __x3__
      app __x4__ = (GetValue trueRef)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {
      access __x6__ = (AssignmentExpression1 "Evaluation")
      let falseRef = __x6__
      app __x7__ = (GetValue falseRef)
      if (is-completion __x7__) if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      app __x8__ = (WrapCompletion __x7__)
      return __x8__
    }
  }""")
}
