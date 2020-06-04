package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement0StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement0StatementRules0""", List(Id("""this"""), Id("""Statement"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""HasCallInTailPosition""")).setId(44983), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(44984), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(44985), IReturn(ERef(RefId(Id("""__x2__""")))).setId(44986))).setId(-1))
  /* Beautified form:
  "IterationStatement0StatementRules0" (this, Statement, Expression) => {
    access __x0__ = (Statement "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
