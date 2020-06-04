package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CanonicalNumericIndexString {
  val length: Int = 1
  val func: Func = Func("""CanonicalNumericIndexString""", List(Id("""argument""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""argument"""))), EStr("""-0""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENum(-0.0))).setId(3151), IReturn(ERef(RefId(Id("""__x0__""")))).setId(3152))).setId(3153), ISeq(List()).setId(3150)).setId(3154), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""argument"""))))).setId(3156), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(3157), IReturn(ERef(RefId(Id("""__x1__""")))).setId(3158)).setId(3159), ISeq(List()).setId(3150)).setId(3160), ILet(Id("""n"""), ERef(RefId(Id("""__x1__""")))).setId(3161), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""n"""))))).setId(3163), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(3164), IReturn(ERef(RefId(Id("""__x2__""")))).setId(3165)).setId(3166), ISeq(List()).setId(3150)).setId(3167), IApp(Id("""__x3__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""argument"""))))).setId(3168), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(3169), IReturn(ERef(RefId(Id("""__x4__""")))).setId(3170))).setId(3171), ISeq(List()).setId(3150)).setId(3172), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""n"""))))).setId(3174), IReturn(ERef(RefId(Id("""__x5__""")))).setId(3175))).setId(-1))
  /* Beautified form:
  "CanonicalNumericIndexString" (argument) => {
    if (= argument "-0") {
      app __x0__ = (WrapCompletion -0.0)
      return __x0__
    } else {}
    app __x1__ = (ToNumber argument)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let n = __x1__
    app __x2__ = (ToString n)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (SameValue __x2__ argument)
    if (= __x3__ false) {
      app __x4__ = (WrapCompletion undefined)
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion n)
    return __x5__
  }
  */
}
