package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToPropertyKey {
  val length: Int = 1
  val func: Func = Func("""ToPropertyKey""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""argument"""))), ERef(RefId(Id("""String"""))))).setId(3032), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(3033), IReturn(ERef(RefId(Id("""__x0__""")))).setId(3034)).setId(3035), ISeq(List()).setId(3036)).setId(3037), ILet(Id("""key"""), ERef(RefId(Id("""__x0__""")))).setId(3038), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""key"""))))).setId(3040), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Symbol""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""key"""))))).setId(3041), IReturn(ERef(RefId(Id("""__x2__""")))).setId(3042))).setId(3044), ISeq(List()).setId(3036)).setId(3045), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""key"""))))).setId(3047), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(3048), IReturn(ERef(RefId(Id("""__x3__""")))).setId(3049)).setId(3050), ISeq(List()).setId(3036)).setId(3051), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(3052), IReturn(ERef(RefId(Id("""__x4__""")))).setId(3053))).setId(-1))
  /* Beautified form:
  "ToPropertyKey" (argument) => {
    app __x0__ = (ToPrimitive argument String)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let key = __x0__
    app __x1__ = (Type key)
    if (= __x1__ Symbol) {
      app __x2__ = (WrapCompletion key)
      return __x2__
    } else {}
    app __x3__ = (ToString key)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
