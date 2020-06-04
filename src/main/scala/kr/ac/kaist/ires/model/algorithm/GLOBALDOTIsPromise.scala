package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTIsPromise {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.IsPromise""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(91236), ILet(Id("""x"""), ERef(RefId(Id("""__x0__""")))).setId(91237), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(91239), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(91240), IReturn(ERef(RefId(Id("""__x2__""")))).setId(91241))).setId(91242), ISeq(List()).setId(91243)).setId(91244), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""x""")), EStr("""PromiseState"""))), EAbsent), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(91246), IReturn(ERef(RefId(Id("""__x3__""")))).setId(91247))).setId(91248), ISeq(List()).setId(91243)).setId(91249), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(91251), IReturn(ERef(RefId(Id("""__x4__""")))).setId(91252))).setId(-1))
  /* Beautified form:
  "GLOBAL.IsPromise" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let x = __x0__
    app __x1__ = (Type x)
    if (! (= __x1__ Object)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    if (= x["PromiseState"] absent) {
      app __x3__ = (WrapCompletion false)
      return __x3__
    } else {}
    app __x4__ = (WrapCompletion true)
    return __x4__
  }
  */
}
