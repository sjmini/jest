package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object DefaultClause0ContainsUndefinedContinueTarget1 {
  val length: Int = 0
  val func: Func = Func("""DefaultClause0ContainsUndefinedContinueTarget1""", List(Id("""this"""), Id("""StatementList"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""StatementList"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(34781), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iterationSet"""))), EList(List()))).setId(34782), IReturn(ERef(RefId(Id("""__x1__""")))).setId(34783))).setId(34784), ISeq(List()).setId(34785)).setId(34786), IReturn(EBool(false)).setId(34788))).setId(-1))
  /* Beautified form:
  "DefaultClause0ContainsUndefinedContinueTarget1" (this, StatementList, iterationSet, labelSet) => {
    if (! (= StatementList absent)) {
      access __x0__ = (StatementList "ContainsUndefinedContinueTarget")
      app __x1__ = (__x0__ iterationSet (new []))
      return __x1__
    } else {}
    return false
  }
  */
}
