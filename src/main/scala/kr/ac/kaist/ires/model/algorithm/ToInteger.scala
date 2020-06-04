package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToInteger {
  val length: Int = 1
  val func: Func = Func("""ToInteger""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""argument"""))))).setId(2383), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(2384), IReturn(ERef(RefId(Id("""__x0__""")))).setId(2385)).setId(2386), ISeq(List()).setId(2387)).setId(2388), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(2389), IIf(EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EINum(0L))).setId(2391), IReturn(ERef(RefId(Id("""__x1__""")))).setId(2392))).setId(2393), ISeq(List()).setId(2387)).setId(2394), IIf(EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""number"""))), EINum(0L)), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(-0.0))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.PositiveInfinity))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NegativeInfinity))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""number"""))))).setId(2396), IReturn(ERef(RefId(Id("""__x2__""")))).setId(2397))).setId(2398), ISeq(List()).setId(2387)).setId(2399), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EConvert(ERef(RefId(Id("""number"""))), CNumToInt, List()))).setId(2401), IReturn(ERef(RefId(Id("""__x3__""")))).setId(2402))).setId(-1))
  /* Beautified form:
  "ToInteger" (argument) => {
    app __x0__ = (ToNumber argument)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let number = __x0__
    if (= number NaN) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    if (|| (|| (|| (= number 0i) (= number -0.0)) (= number Infinity)) (= number -Infinity)) {
      app __x2__ = (WrapCompletion number)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion (convert number num2int ))
    return __x3__
  }
  */
}
