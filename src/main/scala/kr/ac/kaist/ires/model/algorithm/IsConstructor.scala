package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsConstructor {
  val length: Int = 1
  val func: Func = Func("""IsConstructor""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""argument"""))))).setId(3470), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3471), IReturn(ERef(RefId(Id("""__x1__""")))).setId(3472))).setId(3473), ISeq(List()).setId(3474)).setId(3475), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argument""")), EStr("""Construct"""))), EAbsent)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3477), IReturn(ERef(RefId(Id("""__x2__""")))).setId(3478))).setId(3479), ISeq(List()).setId(3474)).setId(3480), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3482), IReturn(ERef(RefId(Id("""__x3__""")))).setId(3483))).setId(-1))
  /* Beautified form:
  "IsConstructor" (argument) => {
    app __x0__ = (Type argument)
    if (! (= __x0__ Object)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (! (= argument["Construct"] absent)) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion false)
    return __x3__
  }
  */
}
