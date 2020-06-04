package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTNumberDOTisNaN {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number.isNaN""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(69016), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(69017), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""number"""))))).setId(69019), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Number"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(69020), IReturn(ERef(RefId(Id("""__x2__""")))).setId(69021))).setId(69022), ISeq(List()).setId(69023)).setId(69024), IIf(EBOp(OEq, ERef(RefId(Id("""number"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(69026), IReturn(ERef(RefId(Id("""__x3__""")))).setId(69027))).setId(69028), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(69029), IReturn(ERef(RefId(Id("""__x4__""")))).setId(69030))).setId(69031)).setId(69032))).setId(-1))
  /* Beautified form:
  "GLOBAL.Number.isNaN" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let number = __x0__
    app __x1__ = (Type number)
    if (! (= __x1__ Number)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    if (= number NaN) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {
      app __x4__ = (WrapCompletion false)
      return __x4__
    }
  }
  */
}
