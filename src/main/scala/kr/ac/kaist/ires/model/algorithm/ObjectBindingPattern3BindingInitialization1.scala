package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ObjectBindingPattern3BindingInitialization1 {
  val length: Int = 0
  val func: Func = Func("""ObjectBindingPattern3BindingInitialization1""", List(Id("""this"""), Id("""BindingPropertyList"""), Id("""BindingRestProperty"""), Id("""value"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingPropertyList"""))), EStr("""PropertyBindingInitialization""")).setId(28420), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""environment"""))))).setId(28421), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(28422), IReturn(ERef(RefId(Id("""__x1__""")))).setId(28423)).setId(28424), ISeq(List()).setId(28425)).setId(28426), ILet(Id("""excludedNames"""), ERef(RefId(Id("""__x1__""")))).setId(28427), IAccess(Id("""__x2__"""), ERef(RefId(Id("""BindingRestProperty"""))), EStr("""RestBindingInitialization""")).setId(28429), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""environment"""))), ERef(RefId(Id("""excludedNames"""))))).setId(28430), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(28431), IReturn(ERef(RefId(Id("""__x4__""")))).setId(28432))).setId(-1))
  /* Beautified form:
  "ObjectBindingPattern3BindingInitialization1" (this, BindingPropertyList, BindingRestProperty, value, environment) => {
    access __x0__ = (BindingPropertyList "PropertyBindingInitialization")
    app __x1__ = (__x0__ value environment)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let excludedNames = __x1__
    access __x2__ = (BindingRestProperty "RestBindingInitialization")
    app __x3__ = (__x2__ value environment excludedNames)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
