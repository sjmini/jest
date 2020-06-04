package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object NumberToString {
  val length: Int = 1
  val func: Func = Func("""NumberToString""", List(Id("""m""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""m"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""NaN"""))).setId(2937), IReturn(ERef(RefId(Id("""__x0__""")))).setId(2938))).setId(2939), ISeq(List()).setId(2940)).setId(2941), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""m"""))), EINum(0L)), EBOp(OEq, ERef(RefId(Id("""m"""))), ENum(-0.0))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""0"""))).setId(2943), IReturn(ERef(RefId(Id("""__x1__""")))).setId(2944))).setId(2945), ISeq(List()).setId(2940)).setId(2946), IIf(EBOp(OLt, ERef(RefId(Id("""m"""))), EINum(0L)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""NumberToString"""))), List(EUOp(ONeg, ERef(RefId(Id("""m""")))))).setId(2948), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(2949), IReturn(ERef(RefId(Id("""__x2__""")))).setId(2950)).setId(2951), ISeq(List()).setId(2940)).setId(2952), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EStr("""-"""), ERef(RefId(Id("""__x2__""")))))).setId(2953), IReturn(ERef(RefId(Id("""__x3__""")))).setId(2954))).setId(2955), ISeq(List()).setId(2940)).setId(2956), IIf(EBOp(OEq, ERef(RefId(Id("""m"""))), ENum(Double.PositiveInfinity)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""Infinity"""))).setId(2958), IReturn(ERef(RefId(Id("""__x4__""")))).setId(2959))).setId(2960), ISeq(List()).setId(2940)).setId(2961), IReturn(EConvert(ERef(RefId(Id("""m"""))), CNumToStr, List())).setId(2963), IExpr(ENotSupported("""Etc""")).setId(2964), IExpr(ENotSupported("""Etc""")).setId(2964), IExpr(ENotSupported("""Etc""")).setId(2964), IExpr(ENotSupported("""Etc""")).setId(2964), IExpr(ENotSupported("""Etc""")).setId(2964))).setId(-1))
  /* Beautified form:
  "NumberToString" (m) => {
    if (= m NaN) {
      app __x0__ = (WrapCompletion "NaN")
      return __x0__
    } else {}
    if (|| (= m 0i) (= m -0.0)) {
      app __x1__ = (WrapCompletion "0")
      return __x1__
    } else {}
    if (< m 0i) {
      app __x2__ = (NumberToString (- m))
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion (+ "-" __x2__))
      return __x3__
    } else {}
    if (= m Infinity) {
      app __x4__ = (WrapCompletion "Infinity")
      return __x4__
    } else {}
    return (convert m num2str )
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
  }
  */
}
