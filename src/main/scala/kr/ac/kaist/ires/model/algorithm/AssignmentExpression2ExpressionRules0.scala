package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AssignmentExpression2ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression2ExpressionRules0""", List(Id("""this"""), Id("""ArrowFunction""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45398), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45399))).setId(-1))
  /* Beautified form:
  "AssignmentExpression2ExpressionRules0" (this, ArrowFunction) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
