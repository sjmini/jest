package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UpdateExpression2Evaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""UpdateExpression2Evaluation0" (this, LeftHandSideExpression) => {
    access __x0__ = (LeftHandSideExpression "Evaluation")
    let lhs = __x0__
    app __x1__ = (GetValue lhs)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToNumeric __x1__)
    if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let oldValue = __x2__
    app __x3__ = (Type oldValue)
    access __x4__ = (PRIMITIVES __x3__)
    access __x5__ = (__x4__ "subtract")
    app __x6__ = (Type oldValue)
    access __x7__ = (PRIMITIVES __x6__)
    access __x8__ = (__x7__ "unit")
    app __x9__ = (__x5__ oldValue __x8__)
    if (is-completion __x9__) if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let newValue = __x9__
    app __x10__ = (PutValue lhs newValue)
    if (is-completion __x10__) if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    __x10__
    app __x11__ = (WrapCompletion oldValue)
    return __x11__
  }""")
}
