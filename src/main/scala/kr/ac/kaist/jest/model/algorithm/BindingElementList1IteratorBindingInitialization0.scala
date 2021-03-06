package kr.ac.kaist.jest.model

import kr.ac.kaist.jest.ir._
import kr.ac.kaist.jest.ir.Parser._

object BindingElementList1IteratorBindingInitialization0 extends Algorithm {
  val name: String = "BindingElementList1IteratorBindingInitialization0"
  val length: Int = 0
  val lang: Boolean = true
  val func: Func = FixUIdWalker(parseFunc(""""BindingElementList1IteratorBindingInitialization0" (this, BindingElementList, BindingElisionElement, iteratorRecord, environment) => {
    access __x0__ = (BindingElementList "IteratorBindingInitialization")
    app __x1__ = (__x0__ iteratorRecord environment)
    if (is-completion __x1__) if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    access __x2__ = (BindingElisionElement "IteratorBindingInitialization")
    app __x3__ = (__x2__ iteratorRecord environment)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }"""), this)
}
