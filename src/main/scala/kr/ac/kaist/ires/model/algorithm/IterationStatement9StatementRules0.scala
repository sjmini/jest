package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object IterationStatement9StatementRules0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement9StatementRules0""", List(Id("""this"""), Id("""ForBinding"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(44895), IReturn(ERef(RefId(Id("""__x0__""")))).setId(44896))).setId(-1))
  /* Beautified form:
  "IterationStatement9StatementRules0" (this, ForBinding, AssignmentExpression, Statement) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
