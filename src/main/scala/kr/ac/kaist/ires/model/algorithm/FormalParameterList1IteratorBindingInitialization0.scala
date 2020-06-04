package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameterList1IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameterList1IteratorBindingInitialization0""", List(Id("""this"""), Id("""FormalParameterList"""), Id("""FormalParameter"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FormalParameterList"""))), EStr("""IteratorBindingInitialization""")).setId(38220), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))).setId(38221), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(38222), IReturn(ERef(RefId(Id("""__x1__""")))).setId(38223)).setId(38224), ISeq(List()).setId(38225)).setId(38226), IExpr(ERef(RefId(Id("""__x1__""")))).setId(38227), IAccess(Id("""__x2__"""), ERef(RefId(Id("""FormalParameter"""))), EStr("""IteratorBindingInitialization""")).setId(38229), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))).setId(38230), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(38231), IReturn(ERef(RefId(Id("""__x4__""")))).setId(38232))).setId(-1))
  /* Beautified form:
  "FormalParameterList1IteratorBindingInitialization0" (this, FormalParameterList, FormalParameter, iteratorRecord, environment) => {
    access __x0__ = (FormalParameterList "IteratorBindingInitialization")
    app __x1__ = (__x0__ iteratorRecord environment)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    access __x2__ = (FormalParameter "IteratorBindingInitialization")
    app __x3__ = (__x2__ iteratorRecord environment)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
