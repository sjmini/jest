package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object RelationalExpression3ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression3ExpressionRules0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45528), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45529))).setId(-1))
  /* Beautified form:
  "RelationalExpression3ExpressionRules0" (this, RelationalExpression, ShiftExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
