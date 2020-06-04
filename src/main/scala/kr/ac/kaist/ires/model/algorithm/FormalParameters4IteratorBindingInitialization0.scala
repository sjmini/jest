package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameters4IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameters4IteratorBindingInitialization0""", List(Id("""this"""), Id("""FormalParameterList"""), Id("""FunctionRestParameter"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FormalParameterList"""))), EStr("""IteratorBindingInitialization""")).setId(38179), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))).setId(38180), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(38181), IReturn(ERef(RefId(Id("""__x1__""")))).setId(38182)).setId(38183), ISeq(List()).setId(38184)).setId(38185), IExpr(ERef(RefId(Id("""__x1__""")))).setId(38186), IAccess(Id("""__x2__"""), ERef(RefId(Id("""FunctionRestParameter"""))), EStr("""IteratorBindingInitialization""")).setId(38188), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))).setId(38189), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(38190), IReturn(ERef(RefId(Id("""__x4__""")))).setId(38191))).setId(-1))
  /* Beautified form:
  "FormalParameters4IteratorBindingInitialization0" (this, FormalParameterList, FunctionRestParameter, iteratorRecord, environment) => {
    access __x0__ = (FormalParameterList "IteratorBindingInitialization")
    app __x1__ = (__x0__ iteratorRecord environment)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    access __x2__ = (FunctionRestParameter "IteratorBindingInitialization")
    app __x3__ = (__x2__ iteratorRecord environment)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
