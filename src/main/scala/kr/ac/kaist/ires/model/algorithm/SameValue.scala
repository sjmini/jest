package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SameValue {
  val length: Int = 2
  val func: Func = Func("""SameValue""", List(Id("""x"""), Id("""y""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(3759), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))).setId(3760), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""__x1__"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3761), IReturn(ERef(RefId(Id("""__x2__""")))).setId(3762))).setId(3803), ISeq(List()).setId(3804)).setId(3765), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(3767), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Number""")))), ISeq(List(IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.NaN)), EBOp(OEq, ERef(RefId(Id("""y"""))), ENum(Double.NaN))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3768), IReturn(ERef(RefId(Id("""__x4__""")))).setId(3769))).setId(3809), ISeq(List()).setId(3810)).setId(3771), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), EINum(0L)), EBOp(OEq, ERef(RefId(Id("""y"""))), ENum(-0.0))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3773), IReturn(ERef(RefId(Id("""__x5__""")))).setId(3774))).setId(3814), ISeq(List()).setId(3815)).setId(3776), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(-0.0)), EBOp(OEq, ERef(RefId(Id("""y"""))), EINum(0L))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3778), IReturn(ERef(RefId(Id("""__x6__""")))).setId(3779))).setId(3819), ISeq(List()).setId(3820)).setId(3781), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3783), IReturn(ERef(RefId(Id("""__x7__""")))).setId(3784))).setId(3824), ISeq(List()).setId(3825)).setId(3786), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3788), IReturn(ERef(RefId(Id("""__x8__""")))).setId(3789))).setId(3829), ISeq(List()).setId(3830)).setId(3792), IApp(Id("""__x9__"""), ERef(RefId(Id("""SameValueNonNumber"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y"""))))).setId(3794), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(3795), IReturn(ERef(RefId(Id("""__x10__""")))).setId(3796))).setId(3835))
  val instToStepMap: Map[Int, Int] = HashMap(3762 -> 0, 3776 -> 12, 3788 -> 12, 3771 -> 12, 3778 -> 8, 3763 -> 0, 3775 -> 6, 3792 -> 13, 3768 -> 4, 3779 -> 8, 3759 -> 1, 3786 -> 12, 3797 -> 14, 3765 -> 1, 3772 -> 12, 3794 -> 14, 3781 -> 12, 3766 -> 1, 3777 -> 12, 3767 -> 13, 3795 -> 14, 3784 -> 10, 3782 -> 12, 3787 -> 12, 3770 -> 4, 3760 -> 1, 3796 -> 14, 3773 -> 6, 3783 -> 10, 3791 -> 12, 3774 -> 6, 3769 -> 4, 3789 -> 12, 3780 -> 8, 3793 -> 13, 3761 -> 0, 3785 -> 10, 3790 -> 12)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(3762, 3763, 3761), 5 -> HashSet(3771, 3772), 10 -> HashSet(3784, 3783, 3785), 14 -> HashSet(3794, 3795, 3796, 3797), 1 -> HashSet(3766, 3760, 3759, 3765), 6 -> HashSet(3775, 3773, 3774), 9 -> HashSet(3781, 3782), 13 -> HashSet(3767, 3792, 3793), 12 -> HashSet(3781, 3777, 3776, 3788, 3771, 3782, 3787, 3786, 3791, 3789, 3790, 3772), 7 -> HashSet(3777, 3776), 11 -> HashSet(3787, 3786), 8 -> HashSet(3778, 3779, 3780), 4 -> HashSet(3770, 3768, 3769))
  /* Beautified form:
  "SameValue" (x, y) => {
    app __x0__ = (Type x)
    app __x1__ = (Type y)
    if (! (= __x0__ __x1__)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (Type x)
    if (= __x3__ Number) {
      if (&& (= x NaN) (= y NaN)) {
        app __x4__ = (WrapCompletion true)
        return __x4__
      } else {}
      if (&& (= x 0i) (= y -0.0)) {
        app __x5__ = (WrapCompletion false)
        return __x5__
      } else {}
      if (&& (= x -0.0) (= y 0i)) {
        app __x6__ = (WrapCompletion false)
        return __x6__
      } else {}
      if (= x y) {
        app __x7__ = (WrapCompletion true)
        return __x7__
      } else {}
      app __x8__ = (WrapCompletion false)
      return __x8__
    } else {}
    app __x9__ = (SameValueNonNumber x y)
    app __x10__ = (WrapCompletion __x9__)
    return __x10__
  }
  */
}
