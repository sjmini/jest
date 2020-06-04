package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IsUnresolvableReference {
  val length: Int = 1
  val func: Func = Func("""IsUnresolvableReference""", List(Id("""V""")), None, IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""V""")), EStr("""BaseValue"""))), EUndef), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(544), IReturn(ERef(RefId(Id("""__x0__""")))).setId(545))).setId(546), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(547), IReturn(ERef(RefId(Id("""__x1__""")))).setId(548))).setId(549)).setId(550))
  /* Beautified form:
  "IsUnresolvableReference" (V) => if (= V["BaseValue"] undefined) {
    app __x0__ = (WrapCompletion true)
    return __x0__
  } else {
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}
