package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SameValue {
  val length: Int = 2
  val func: Func = Func("""SameValue""", List(Id("""x"""), Id("""y""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(3759), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))).setId(3760), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""__x1__"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3761), IReturn(ERef(RefId(Id("""__x2__""")))).setId(3762))).setId(3763), ISeq(List()).setId(3764)).setId(3765), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(3767), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Number""")))), ISeq(List(IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.NaN)), EBOp(OEq, ERef(RefId(Id("""y"""))), ENum(Double.NaN))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3768), IReturn(ERef(RefId(Id("""__x4__""")))).setId(3769))).setId(3770), ISeq(List()).setId(3764)).setId(3771), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), EINum(0L)), EBOp(OEq, ERef(RefId(Id("""y"""))), ENum(-0.0))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3773), IReturn(ERef(RefId(Id("""__x5__""")))).setId(3774))).setId(3775), ISeq(List()).setId(3764)).setId(3776), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(-0.0)), EBOp(OEq, ERef(RefId(Id("""y"""))), EINum(0L))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3778), IReturn(ERef(RefId(Id("""__x6__""")))).setId(3779))).setId(3780), ISeq(List()).setId(3764)).setId(3781), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3783), IReturn(ERef(RefId(Id("""__x7__""")))).setId(3784))).setId(3785), ISeq(List()).setId(3764)).setId(3786), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3788), IReturn(ERef(RefId(Id("""__x8__""")))).setId(3789))).setId(3791), ISeq(List()).setId(3764)).setId(3792), IApp(Id("""__x9__"""), ERef(RefId(Id("""SameValueNonNumber"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y"""))))).setId(3794), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(3795), IReturn(ERef(RefId(Id("""__x10__""")))).setId(3796))).setId(-1))
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
