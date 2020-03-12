package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object NumberToString {
  val length: Int = 1
  val func: Func = Func("""NumberToString""", List(Id("""m""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""m"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""NaN"""))).setId(2937), IReturn(ERef(RefId(Id("""__x0__""")))).setId(2938))).setId(2968), ISeq(List()).setId(2969)).setId(2941), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""m"""))), EINum(0L)), EBOp(OEq, ERef(RefId(Id("""m"""))), ENum(-0.0))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""0"""))).setId(2943), IReturn(ERef(RefId(Id("""__x1__""")))).setId(2944))).setId(2973), ISeq(List()).setId(2974)).setId(2946), IIf(EBOp(OLt, ERef(RefId(Id("""m"""))), EINum(0L)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""NumberToString"""))), List(EUOp(ONeg, ERef(RefId(Id("""m""")))))).setId(2948), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(2949), IReturn(ERef(RefId(Id("""__x2__""")))).setId(2950)).setId(2951), ISeq(List()).setId(2980)).setId(2952), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EStr("""-"""), ERef(RefId(Id("""__x2__""")))))).setId(2953), IReturn(ERef(RefId(Id("""__x3__""")))).setId(2954))).setId(2984), ISeq(List()).setId(2985)).setId(2956), IIf(EBOp(OEq, ERef(RefId(Id("""m"""))), ENum(Double.PositiveInfinity)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""Infinity"""))).setId(2958), IReturn(ERef(RefId(Id("""__x4__""")))).setId(2959))).setId(2989), ISeq(List()).setId(2990)).setId(2961), IReturn(EConvert(ERef(RefId(Id("""m"""))), CNumToStr, List())).setId(2963), IExpr(ENotSupported("""Etc""")).setId(2964), IExpr(ENotSupported("""Etc""")).setId(2964), IExpr(ENotSupported("""Etc""")).setId(2964), IExpr(ENotSupported("""Etc""")).setId(2964), IExpr(ENotSupported("""Etc""")).setId(2964))).setId(2998))
  val instToStepMap: Map[Int, Int] = HashMap(2957 -> 5, 2964 -> 32, 2954 -> 4, 2937 -> 0, 2958 -> 6, 2946 -> 3, 2963 -> 8, 2941 -> 1, 2962 -> 7, 2952 -> 4, 2942 -> 1, 2960 -> 6, 2961 -> 7, 2953 -> 4, 2947 -> 3, 2938 -> 0, 2959 -> 6, 2955 -> 4, 2943 -> 2, 2945 -> 2, 2948 -> 4, 2939 -> 0, 2944 -> 2, 2956 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(2937, 2938, 2939), 5 -> HashSet(2957, 2956), 25 -> HashSet(2964), 20 -> HashSet(2964), 1 -> HashSet(2941, 2942), 6 -> HashSet(2958, 2959, 2960), 2 -> HashSet(2944, 2943, 2945), 32 -> HashSet(2964), 7 -> HashSet(2962, 2961), 3 -> HashSet(2947, 2946), 11 -> HashSet(2964), 8 -> HashSet(2963), 4 -> HashSet(2953, 2954, 2955, 2952, 2948), 15 -> HashSet(2964))
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
