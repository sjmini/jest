package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression1ExpressionRules0""", List(Id("""this"""), Id("""YieldExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45388), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45389))).setId(-1))
  /* Beautified form:
  "AssignmentExpression1ExpressionRules0" (this, YieldExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
