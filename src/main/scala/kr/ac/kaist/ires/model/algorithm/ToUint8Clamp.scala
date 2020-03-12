package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ToUint8Clamp {
  val length: Int = 1
  val func: Func = Func("""ToUint8Clamp""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""argument"""))))).setId(2820), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(2821), IReturn(ERef(RefId(Id("""__x0__""")))).setId(2822)).setId(2823), ISeq(List()).setId(2865)).setId(2825), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(2826), IIf(EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EINum(0L))).setId(2828), IReturn(ERef(RefId(Id("""__x1__""")))).setId(2829))).setId(2870), ISeq(List()).setId(2871)).setId(2831), IIf(EUOp(ONot, EBOp(OLt, EINum(0L), ERef(RefId(Id("""number"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EINum(0L))).setId(2833), IReturn(ERef(RefId(Id("""__x2__""")))).setId(2834))).setId(2875), ISeq(List()).setId(2876)).setId(2836), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""number"""))), EINum(255L))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EINum(255L))).setId(2838), IReturn(ERef(RefId(Id("""__x3__""")))).setId(2839))).setId(2880), ISeq(List()).setId(2881)).setId(2841), IApp(Id("""__x4__"""), ERef(RefId(Id("""floor"""))), List(ERef(RefId(Id("""number"""))))).setId(2843), ILet(Id("""f"""), ERef(RefId(Id("""__x4__""")))).setId(2844), IIf(EBOp(OLt, EBOp(OPlus, ERef(RefId(Id("""f"""))), ENum(0.5)), ERef(RefId(Id("""number""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""f"""))), EINum(1L)))).setId(2846), IReturn(ERef(RefId(Id("""__x5__""")))).setId(2847))).setId(2887), ISeq(List()).setId(2888)).setId(2849), IIf(EBOp(OLt, ERef(RefId(Id("""number"""))), EBOp(OPlus, ERef(RefId(Id("""f"""))), ENum(0.5))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""f"""))))).setId(2851), IReturn(ERef(RefId(Id("""__x6__""")))).setId(2852))).setId(2892), ISeq(List()).setId(2893)).setId(2854), IExpr(ENotSupported("""Etc""")).setId(2856), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""f"""))))).setId(2857), IReturn(ERef(RefId(Id("""__x7__""")))).setId(2858))).setId(2898))
  val instToStepMap: Map[Int, Int] = HashMap(2844 -> 7, 2825 -> 0, 2833 -> 3, 2830 -> 1, 2842 -> 6, 2835 -> 3, 2846 -> 8, 2828 -> 1, 2847 -> 8, 2837 -> 4, 2854 -> 11, 2857 -> 13, 2852 -> 10, 2829 -> 1, 2826 -> 0, 2820 -> 0, 2840 -> 5, 2841 -> 6, 2858 -> 13, 2836 -> 4, 2845 -> 7, 2851 -> 10, 2859 -> 13, 2849 -> 9, 2827 -> 0, 2839 -> 5, 2856 -> 12, 2850 -> 9, 2831 -> 2, 2838 -> 5, 2843 -> 7, 2848 -> 8, 2855 -> 11, 2853 -> 10, 2832 -> 2, 2834 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(2825, 2827, 2826, 2820), 5 -> HashSet(2840, 2839, 2838), 10 -> HashSet(2852, 2851, 2853), 1 -> HashSet(2829, 2830, 2828), 6 -> HashSet(2841, 2842), 9 -> HashSet(2849, 2850), 13 -> HashSet(2857, 2858, 2859), 2 -> HashSet(2831, 2832), 12 -> HashSet(2856), 7 -> HashSet(2844, 2845, 2843), 3 -> HashSet(2833, 2835, 2834), 11 -> HashSet(2854, 2855), 8 -> HashSet(2846, 2848, 2847), 4 -> HashSet(2837, 2836))
  /* Beautified form:
  "ToUint8Clamp" (argument) => {
    app __x0__ = (ToNumber argument)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let number = __x0__
    if (= number NaN) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    if (! (< 0i number)) {
      app __x2__ = (WrapCompletion 0i)
      return __x2__
    } else {}
    if (! (< number 255i)) {
      app __x3__ = (WrapCompletion 255i)
      return __x3__
    } else {}
    app __x4__ = (floor number)
    let f = __x4__
    if (< (+ f 0.5) number) {
      app __x5__ = (WrapCompletion (+ f 1i))
      return __x5__
    } else {}
    if (< number (+ f 0.5)) {
      app __x6__ = (WrapCompletion f)
      return __x6__
    } else {}
    !!! "Etc"
    app __x7__ = (WrapCompletion f)
    return __x7__
  }
  */
}
