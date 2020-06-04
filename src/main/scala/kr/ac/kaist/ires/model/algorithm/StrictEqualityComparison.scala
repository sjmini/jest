package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object StrictEqualityComparison {
  val length: Int = 0
  val func: Func = Func("""StrictEqualityComparison""", List(Id("""x"""), Id("""y""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(4836), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))).setId(4837), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""__x1__"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4838), IReturn(ERef(RefId(Id("""__x2__""")))).setId(4839))).setId(4840), ISeq(List()).setId(4841)).setId(4842), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(4844), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Number""")))), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4845), IReturn(ERef(RefId(Id("""__x4__""")))).setId(4846))).setId(4847), ISeq(List()).setId(4841)).setId(4848), IIf(EBOp(OEq, ERef(RefId(Id("""y"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4850), IReturn(ERef(RefId(Id("""__x5__""")))).setId(4851))).setId(4852), ISeq(List()).setId(4841)).setId(4853), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(4855), IReturn(ERef(RefId(Id("""__x6__""")))).setId(4856))).setId(4857), ISeq(List()).setId(4841)).setId(4858), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), EINum(0L)), EBOp(OEq, ERef(RefId(Id("""y"""))), ENum(-0.0))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(4860), IReturn(ERef(RefId(Id("""__x7__""")))).setId(4861))).setId(4862), ISeq(List()).setId(4841)).setId(4863), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(-0.0)), EBOp(OEq, ERef(RefId(Id("""y"""))), EINum(0L))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(4865), IReturn(ERef(RefId(Id("""__x8__""")))).setId(4866))).setId(4867), ISeq(List()).setId(4841)).setId(4868), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4870), IReturn(ERef(RefId(Id("""__x9__""")))).setId(4871))).setId(4873), ISeq(List()).setId(4841)).setId(4874), IApp(Id("""__x10__"""), ERef(RefId(Id("""SameValueNonNumber"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y"""))))).setId(4876), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(4877), IReturn(ERef(RefId(Id("""__x11__""")))).setId(4878))).setId(-1))
  /* Beautified form:
  "StrictEqualityComparison" (x, y) => {
    app __x0__ = (Type x)
    app __x1__ = (Type y)
    if (! (= __x0__ __x1__)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (Type x)
    if (= __x3__ Number) {
      if (= x NaN) {
        app __x4__ = (WrapCompletion false)
        return __x4__
      } else {}
      if (= y NaN) {
        app __x5__ = (WrapCompletion false)
        return __x5__
      } else {}
      if (= x y) {
        app __x6__ = (WrapCompletion true)
        return __x6__
      } else {}
      if (&& (= x 0i) (= y -0.0)) {
        app __x7__ = (WrapCompletion true)
        return __x7__
      } else {}
      if (&& (= x -0.0) (= y 0i)) {
        app __x8__ = (WrapCompletion true)
        return __x8__
      } else {}
      app __x9__ = (WrapCompletion false)
      return __x9__
    } else {}
    app __x10__ = (SameValueNonNumber x y)
    app __x11__ = (WrapCompletion __x10__)
    return __x11__
  }
  */
}
