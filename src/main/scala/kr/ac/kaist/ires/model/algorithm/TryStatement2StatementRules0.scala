package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement2StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement2StatementRules0""", List(Id("""this"""), Id("""Block"""), Id("""Catch"""), Id("""Finally""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Finally"""))), EStr("""HasCallInTailPosition""")).setId(45356), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45357), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45358), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45359))).setId(-1))
  /* Beautified form:
  "TryStatement2StatementRules0" (this, Block, Catch, Finally) => {
    access __x0__ = (Finally "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
