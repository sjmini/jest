package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ToInt8 {
  val length: Int = 1
  val func: Func = Func("""ToInt8""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""argument"""))))).setId(2695), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(2696), IReturn(ERef(RefId(Id("""__x0__""")))).setId(2697)).setId(2698), ISeq(List()).setId(2699)).setId(2700), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(2701), IIf(EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NaN)), EBOp(OEq, ERef(RefId(Id("""number"""))), EINum(0L))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(-0.0))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.PositiveInfinity))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NegativeInfinity))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EINum(0L))).setId(2703), IReturn(ERef(RefId(Id("""__x1__""")))).setId(2704))).setId(2705), ISeq(List()).setId(2699)).setId(2706), ILet(Id("""int"""), EConvert(ERef(RefId(Id("""number"""))), CNumToInt, List())).setId(2708), ILet(Id("""int8bit"""), EBOp(OUMod, ERef(RefId(Id("""int"""))), EINum(256L))).setId(2710), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""int8bit"""))), EINum(128L))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OSub, ERef(RefId(Id("""int8bit"""))), EINum(256L)))).setId(2712), IReturn(ERef(RefId(Id("""__x2__""")))).setId(2713))).setId(2714), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""int8bit"""))))).setId(2715), IReturn(ERef(RefId(Id("""__x3__""")))).setId(2716))).setId(2717)).setId(2718))).setId(-1))
  /* Beautified form:
  "ToInt8" (argument) => {
    app __x0__ = (ToNumber argument)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let number = __x0__
    if (|| (|| (|| (|| (= number NaN) (= number 0i)) (= number -0.0)) (= number Infinity)) (= number -Infinity)) {
      app __x1__ = (WrapCompletion 0i)
      return __x1__
    } else {}
    let int = (convert number num2int )
    let int8bit = (%% int 256i)
    if (! (< int8bit 128i)) {
      app __x2__ = (WrapCompletion (- int8bit 256i))
      return __x2__
    } else {
      app __x3__ = (WrapCompletion int8bit)
      return __x3__
    }
  }
  */
}
