package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentExpression4ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression4ExpressionRules0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45418), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45419))).setId(-1))
  /* Beautified form:
  "AssignmentExpression4ExpressionRules0" (this, LeftHandSideExpression, AssignmentExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
