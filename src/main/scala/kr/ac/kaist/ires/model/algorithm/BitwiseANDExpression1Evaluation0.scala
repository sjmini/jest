package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BitwiseANDExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = parseFunc(""""BitwiseANDExpression1Evaluation0" (this, A, B) => {
    access __x0__ = (A "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (B "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (is-completion __x3__) if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    app __x4__ = (ToNumeric lval)
    if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let lnum = __x4__
    app __x5__ = (ToNumeric rval)
    if (is-completion __x5__) if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let rnum = __x5__
    app __x6__ = (WrapCompletion (& lnum rnum))
    return __x6__
    app __x7__ = (Type lnum)
    let T = __x7__
    !!! "If @ is code:{&} , return id:{T} : : bitwiseAND ( id:{lnum} , id:{rnum} ) ."
    !!! "If @ is code:{|} , return id:{T} : : bitwiseOR ( id:{lnum} , id:{rnum} ) ."
    !!! "Otherwise , @ is code:{^} ; return id:{T} : : bitwiseXOR ( id:{lnum} , id:{rnum} ) ."
  }""")
}
