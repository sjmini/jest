package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object TryStatement1StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement1StatementRules0""", List(Id("""this"""), Id("""Block"""), Id("""Finally""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Finally"""))), EStr("""HasCallInTailPosition""")).setId(45340), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45341), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45342), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45343))).setId(-1))
  /* Beautified form:
  "TryStatement1StatementRules0" (this, Block, Finally) => {
    access __x0__ = (Finally "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
