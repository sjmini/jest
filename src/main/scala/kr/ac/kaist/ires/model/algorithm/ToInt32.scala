package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToInt32 {
  val length: Int = 1
  val func: Func = Func("""ToInt32""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""argument"""))))).setId(2445), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(2446), IReturn(ERef(RefId(Id("""__x0__""")))).setId(2447)).setId(2448), ISeq(List()).setId(2449)).setId(2450), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(2451), IIf(EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NaN)), EBOp(OEq, ERef(RefId(Id("""number"""))), EINum(0L))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(-0.0))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.PositiveInfinity))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NegativeInfinity))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EINum(0L))).setId(2453), IReturn(ERef(RefId(Id("""__x1__""")))).setId(2454))).setId(2455), ISeq(List()).setId(2449)).setId(2456), ILet(Id("""int"""), EConvert(ERef(RefId(Id("""number"""))), CNumToInt, List())).setId(2458), ILet(Id("""int32bit"""), EBOp(OUMod, ERef(RefId(Id("""int"""))), EINum(4294967296L))).setId(2460), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""int32bit"""))), EINum(2147483648L))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OSub, ERef(RefId(Id("""int32bit"""))), EINum(4294967296L)))).setId(2462), IReturn(ERef(RefId(Id("""__x2__""")))).setId(2463))).setId(2464), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""int32bit"""))))).setId(2465), IReturn(ERef(RefId(Id("""__x3__""")))).setId(2466))).setId(2467)).setId(2468))).setId(-1))
  /* Beautified form:
  "ToInt32" (argument) => {
    app __x0__ = (ToNumber argument)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let number = __x0__
    if (|| (|| (|| (|| (= number NaN) (= number 0i)) (= number -0.0)) (= number Infinity)) (= number -Infinity)) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    let int = (convert number num2int )
    let int32bit = (%% int 4294967296i)
    if (! (< int32bit 2147483648i)) {
      app __x2__ = (WrapCompletion (- int32bit 4294967296i))
      return __x2__
    } else {
      app __x3__ = (WrapCompletion int32bit)
      return __x3__
    }
  }
  */
}
