package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement1ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement1ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""Block"""), Id("""Finally"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(36830), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36831), ILet(Id("""hasUndefinedLabels"""), ERef(RefId(Id("""__x1__""")))).setId(36832), IIf(EBOp(OEq, ERef(RefId(Id("""hasUndefinedLabels"""))), EBool(true)), IReturn(EBool(true)).setId(36834), ISeq(List()).setId(36836)).setId(36837), IAccess(Id("""__x2__"""), ERef(RefId(Id("""Finally"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(36839), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36840), IReturn(ERef(RefId(Id("""__x3__""")))).setId(36841))).setId(-1))
  /* Beautified form:
  "TryStatement1ContainsUndefinedBreakTarget0" (this, Block, Finally, labelSet) => {
    access __x0__ = (Block "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    let hasUndefinedLabels = __x1__
    if (= hasUndefinedLabels true) return true else {}
    access __x2__ = (Finally "ContainsUndefinedBreakTarget")
    app __x3__ = (__x2__ labelSet)
    return __x3__
  }
  */
}
