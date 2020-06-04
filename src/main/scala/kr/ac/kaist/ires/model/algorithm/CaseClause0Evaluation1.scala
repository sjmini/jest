package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClause0Evaluation1 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0Evaluation1""", List(Id("""this"""), Id("""Expression"""), Id("""StatementList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""Evaluation""")).setId(36102), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(36103), IReturn(ERef(RefId(Id("""__x1__""")))).setId(36104))).setId(-1))
  /* Beautified form:
  "CaseClause0Evaluation1" (this, Expression, StatementList) => {
    access __x0__ = (StatementList "Evaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
