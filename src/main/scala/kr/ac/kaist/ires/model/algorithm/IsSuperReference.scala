package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsSuperReference {
  val length: Int = 1
  val func: Func = Func("""IsSuperReference""", List(Id("""V""")), None, IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""V""")), EStr("""thisValue"""))), EAbsent)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(568), IReturn(ERef(RefId(Id("""__x0__""")))).setId(569))).setId(570), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(571), IReturn(ERef(RefId(Id("""__x1__""")))).setId(572))).setId(573)).setId(574))
  /* Beautified form:
  "IsSuperReference" (V) => if (! (= V["thisValue"] absent)) {
    app __x0__ = (WrapCompletion true)
    return __x0__
  } else {
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}
