package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DefaultClause0StatementRules1 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0StatementRules1""", List(Id("""this"""), Id("""StatementList""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""HasCallInTailPosition""")).setId(45292), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45293), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45294), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45295))).setId(45296), ISeq(List()).setId(45297)).setId(45298), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45300), IReturn(ERef(RefId(Id("""__x3__""")))).setId(45301))).setId(-1))
  /* Beautified form:
  "DefaultClause0StatementRules1" (this, StatementList) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "HasCallInTailPosition")
      app __x1__ = (__x0__ call)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion false)
    return __x3__
  }
  */
}
