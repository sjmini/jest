package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EqualityExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""EqualityExpression1ExpressionRules0""", List(Id("""this"""), Id("""EqualityExpression"""), Id("""RelationalExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45468), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45469))).setId(-1))
  /* Beautified form:
  "EqualityExpression1ExpressionRules0" (this, EqualityExpression, RelationalExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
