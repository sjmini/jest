package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsPromise {
  val length: Int = 1
  val func: Func = Func("""IsPromise""", List(Id("""x""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(12357), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(12358), IReturn(ERef(RefId(Id("""__x1__""")))).setId(12359))).setId(12360), ISeq(List()).setId(12361)).setId(12362), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""x""")), EStr("""PromiseState"""))), EAbsent), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(12364), IReturn(ERef(RefId(Id("""__x2__""")))).setId(12365))).setId(12366), ISeq(List()).setId(12361)).setId(12367), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(12369), IReturn(ERef(RefId(Id("""__x3__""")))).setId(12370))).setId(-1))
  /* Beautified form:
  "IsPromise" (x) => {
    app __x0__ = (Type x)
    if (! (= __x0__ Object)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (= x["PromiseState"] absent) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion true)
    return __x3__
  }
  */
}
