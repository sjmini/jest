package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTisFinite {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number.isFinite""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(68930), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(68931), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""number"""))))).setId(68933), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Number"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(68934), IReturn(ERef(RefId(Id("""__x2__""")))).setId(68935))).setId(68936), ISeq(List()).setId(68937)).setId(68938), IIf(EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NaN)), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.PositiveInfinity))), EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NegativeInfinity))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(68940), IReturn(ERef(RefId(Id("""__x3__""")))).setId(68941))).setId(68942), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(68943), IReturn(ERef(RefId(Id("""__x4__""")))).setId(68944))).setId(68945)).setId(68946))).setId(-1))
  /* Beautified form:
  "GLOBAL.Number.isFinite" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let number = __x0__
    app __x1__ = (Type number)
    if (! (= __x1__ Number)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    if (|| (|| (= number NaN) (= number Infinity)) (= number -Infinity)) {
      app __x3__ = (WrapCompletion false)
      return __x3__
    } else {
      app __x4__ = (WrapCompletion true)
      return __x4__
    }
  }
  */
}
