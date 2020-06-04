package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CaseClause0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""CaseClause0Evaluation0""", List(Id("""this"""), Id("""Expression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(36088), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(36089), IReturn(ERef(RefId(Id("""__x1__""")))).setId(36090))).setId(-1))
  /* Beautified form:
  "CaseClause0Evaluation0" (this, Expression) => {
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
