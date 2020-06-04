package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Catch0StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""Catch0StatementRules0""", List(Id("""this"""), Id("""CatchParameter"""), Id("""Block""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""HasCallInTailPosition""")).setId(45372), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45373), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45374), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45375))).setId(-1))
  /* Beautified form:
  "Catch0StatementRules0" (this, CatchParameter, Block) => {
    access __x0__ = (Block "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
