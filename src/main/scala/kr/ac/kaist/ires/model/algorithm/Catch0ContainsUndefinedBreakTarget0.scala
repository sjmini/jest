package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Catch0ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""Catch0ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""CatchParameter"""), Id("""Block"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""ContainsUndefinedBreakTarget""")).setId(36918), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(36919), IReturn(ERef(RefId(Id("""__x1__""")))).setId(36920))).setId(-1))
  /* Beautified form:
  "Catch0ContainsUndefinedBreakTarget0" (this, CatchParameter, Block, labelSet) => {
    access __x0__ = (Block "ContainsUndefinedBreakTarget")
    app __x1__ = (__x0__ labelSet)
    return __x1__
  }
  */
}
