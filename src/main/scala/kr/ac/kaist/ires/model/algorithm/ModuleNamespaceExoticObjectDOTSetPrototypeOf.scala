package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ModuleNamespaceExoticObjectDOTSetPrototypeOf {
  val length: Int = 1
  val func: Func = Func("""ModuleNamespaceExoticObject.SetPrototypeOf""", List(Id("""O"""), Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""SetImmutablePrototype"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""V"""))))).setId(57558), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(57559), IReturn(ERef(RefId(Id("""__x0__""")))).setId(57560)).setId(57561), ISeq(List()).setId(57562)).setId(57563), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(57564), IReturn(ERef(RefId(Id("""__x1__""")))).setId(57565))).setId(-1))
  /* Beautified form:
  "ModuleNamespaceExoticObject.SetPrototypeOf" (O, V) => {
    app __x0__ = (SetImmutablePrototype O V)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
