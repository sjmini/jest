package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingIdentifier1BindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingIdentifier1BindingInitialization0""", List(Id("""this"""), Id("""value"""), Id("""environment""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""InitializeBoundName"""))), List(EStr("""yield"""), ERef(RefId(Id("""value"""))), ERef(RefId(Id("""environment"""))))).setId(13239), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(13240), IReturn(ERef(RefId(Id("""__x0__""")))).setId(13241)).setId(13242), ISeq(List()).setId(13243)).setId(13244), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(13245), IReturn(ERef(RefId(Id("""__x1__""")))).setId(13246))).setId(-1))
  /* Beautified form:
  "BindingIdentifier1BindingInitialization0" (this, value, environment) => {
    app __x0__ = (InitializeBoundName "yield" value environment)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
