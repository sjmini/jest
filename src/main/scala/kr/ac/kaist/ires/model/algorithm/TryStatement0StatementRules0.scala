package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement0StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement0StatementRules0""", List(Id("""this"""), Id("""Block"""), Id("""Catch""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Catch"""))), EStr("""HasCallInTailPosition""")).setId(45324), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45325), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45326), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45327))).setId(-1))
  /* Beautified form:
  "TryStatement0StatementRules0" (this, Block, Catch) => {
    access __x0__ = (Catch "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
