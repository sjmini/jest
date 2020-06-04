package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object SwitchStatement0ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""SwitchStatement0ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""Expression"""), Id("""CaseBlock"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseBlock"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(34453), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34454), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34455))).setId(-1))
  /* Beautified form:
  "SwitchStatement0ContainsUndefinedBreakTarget0" (this, Expression, CaseBlock, labelSet) => {
    access __x0__ = (CaseBlock "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
