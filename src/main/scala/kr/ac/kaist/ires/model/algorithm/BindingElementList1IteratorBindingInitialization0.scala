package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingElementList1IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingElementList1IteratorBindingInitialization0""", List(Id("""this"""), Id("""BindingElementList"""), Id("""BindingElisionElement"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElementList"""))), EStr("""IteratorBindingInitialization""")).setId(28975), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))).setId(28976), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(28977), IReturn(ERef(RefId(Id("""__x1__""")))).setId(28978)).setId(28979), ISeq(List()).setId(28980)).setId(28981), IExpr(ERef(RefId(Id("""__x1__""")))).setId(28982), IAccess(Id("""__x2__"""), ERef(RefId(Id("""BindingElisionElement"""))), EStr("""IteratorBindingInitialization""")).setId(28984), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))).setId(28985), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(28986), IReturn(ERef(RefId(Id("""__x4__""")))).setId(28987))).setId(-1))
  /* Beautified form:
  "BindingElementList1IteratorBindingInitialization0" (this, BindingElementList, BindingElisionElement, iteratorRecord, environment) => {
    access __x0__ = (BindingElementList "IteratorBindingInitialization")
    app __x1__ = (__x0__ iteratorRecord environment)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    access __x2__ = (BindingElisionElement "IteratorBindingInitialization")
    app __x3__ = (__x2__ iteratorRecord environment)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
