package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SameValueZero {
  val length: Int = 2
  val func: Func = Func("""SameValueZero""", List(Id("""x"""), Id("""y""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(3873), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))).setId(3874), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""__x1__"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3875), IReturn(ERef(RefId(Id("""__x2__""")))).setId(3876))).setId(3917), ISeq(List()).setId(3918)).setId(3879), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(3881), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Number""")))), ISeq(List(IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.NaN)), EBOp(OEq, ERef(RefId(Id("""y"""))), ENum(Double.NaN))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3882), IReturn(ERef(RefId(Id("""__x4__""")))).setId(3883))).setId(3923), ISeq(List()).setId(3924)).setId(3885), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), EINum(0L)), EBOp(OEq, ERef(RefId(Id("""y"""))), ENum(-0.0))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3887), IReturn(ERef(RefId(Id("""__x5__""")))).setId(3888))).setId(3928), ISeq(List()).setId(3929)).setId(3890), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(-0.0)), EBOp(OEq, ERef(RefId(Id("""y"""))), EINum(0L))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3892), IReturn(ERef(RefId(Id("""__x6__""")))).setId(3893))).setId(3933), ISeq(List()).setId(3934)).setId(3895), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3897), IReturn(ERef(RefId(Id("""__x7__""")))).setId(3898))).setId(3938), ISeq(List()).setId(3939)).setId(3900), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3902), IReturn(ERef(RefId(Id("""__x8__""")))).setId(3903))).setId(3943), ISeq(List()).setId(3944)).setId(3906), IApp(Id("""__x9__"""), ERef(RefId(Id("""SameValueNonNumber"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y"""))))).setId(3908), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(3909), IReturn(ERef(RefId(Id("""__x10__""")))).setId(3910))).setId(3949))
  val instToStepMap: Map[Int, Int] = HashMap(3895 -> 12, 3891 -> 12, 3902 -> 12, 3887 -> 6, 3906 -> 13, 3899 -> 10, 3909 -> 14, 3903 -> 12, 3900 -> 12, 3893 -> 8, 3881 -> 13, 3904 -> 12, 3885 -> 12, 3874 -> 1, 3911 -> 14, 3886 -> 12, 3901 -> 12, 3873 -> 1, 3883 -> 4, 3905 -> 12, 3910 -> 14, 3898 -> 10, 3880 -> 1, 3884 -> 4, 3889 -> 6, 3877 -> 0, 3894 -> 8, 3890 -> 12, 3888 -> 6, 3908 -> 14, 3876 -> 0, 3879 -> 1, 3896 -> 12, 3907 -> 13, 3892 -> 8, 3882 -> 4, 3897 -> 10, 3875 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(3877, 3876, 3875), 5 -> HashSet(3885, 3886), 10 -> HashSet(3898, 3899, 3897), 14 -> HashSet(3910, 3909, 3908, 3911), 1 -> HashSet(3873, 3880, 3874, 3879), 6 -> HashSet(3887, 3889, 3888), 9 -> HashSet(3895, 3896), 13 -> HashSet(3906, 3881, 3907), 12 -> HashSet(3905, 3895, 3891, 3902, 3903, 3890, 3900, 3904, 3885, 3896, 3886, 3901), 7 -> HashSet(3891, 3890), 11 -> HashSet(3900, 3901), 8 -> HashSet(3894, 3893, 3892), 4 -> HashSet(3883, 3884, 3882))
  /* Beautified form:
  "SameValueZero" (x, y) => {
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
        app __x5__ = (WrapCompletion true)
        return __x5__
      } else {}
      if (&& (= x -0.0) (= y 0i)) {
        app __x6__ = (WrapCompletion true)
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
