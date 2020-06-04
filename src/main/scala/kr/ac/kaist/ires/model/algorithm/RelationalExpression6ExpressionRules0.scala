package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object RelationalExpression6ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression6ExpressionRules0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45558), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45559))).setId(-1))
  /* Beautified form:
  "RelationalExpression6ExpressionRules0" (this, RelationalExpression, ShiftExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
