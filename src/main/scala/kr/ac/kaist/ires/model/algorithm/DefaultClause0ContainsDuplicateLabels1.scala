package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DefaultClause0ContainsDuplicateLabels1 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0ContainsDuplicateLabels1""", List(Id("""this"""), Id("""StatementList"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""ContainsDuplicateLabels""")).setId(34427), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""labelSet"""))))).setId(34428), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34429))).setId(34430), ISeq(List()).setId(34431)).setId(34432), IReturn(EBool(false)).setId(34434))).setId(-1))
  /* Beautified form:
  "DefaultClause0ContainsDuplicateLabels1" (this, StatementList, labelSet) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "ContainsDuplicateLabels")
      app __x1__ = (__x0__ labelSet)
      return __x1__
    } else {}
    return false
  }
  */
}
