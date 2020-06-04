package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SameValueZero {
  val length: Int = 2
  val func: Func = Func("""SameValueZero""", List(Id("""x"""), Id("""y""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(3873), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))).setId(3874), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""__x1__"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3875), IReturn(ERef(RefId(Id("""__x2__""")))).setId(3876))).setId(3877), ISeq(List()).setId(3878)).setId(3879), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(3881), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Number""")))), ISeq(List(IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.NaN)), EBOp(OEq, ERef(RefId(Id("""y"""))), ENum(Double.NaN))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3882), IReturn(ERef(RefId(Id("""__x4__""")))).setId(3883))).setId(3884), ISeq(List()).setId(3878)).setId(3885), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), EINum(0L)), EBOp(OEq, ERef(RefId(Id("""y"""))), ENum(-0.0))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3887), IReturn(ERef(RefId(Id("""__x5__""")))).setId(3888))).setId(3889), ISeq(List()).setId(3878)).setId(3890), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(-0.0)), EBOp(OEq, ERef(RefId(Id("""y"""))), EINum(0L))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3892), IReturn(ERef(RefId(Id("""__x6__""")))).setId(3893))).setId(3894), ISeq(List()).setId(3878)).setId(3895), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3897), IReturn(ERef(RefId(Id("""__x7__""")))).setId(3898))).setId(3899), ISeq(List()).setId(3878)).setId(3900), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3902), IReturn(ERef(RefId(Id("""__x8__""")))).setId(3903))).setId(3905), ISeq(List()).setId(3878)).setId(3906), IApp(Id("""__x9__"""), ERef(RefId(Id("""SameValueNonNumber"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y"""))))).setId(3908), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(3909), IReturn(ERef(RefId(Id("""__x10__""")))).setId(3910))).setId(-1))
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
