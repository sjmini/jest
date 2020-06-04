package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object EqualityExpression3ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""EqualityExpression3ExpressionRules0""", List(Id("""this"""), Id("""EqualityExpression"""), Id("""RelationalExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45488), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45489))).setId(-1))
  /* Beautified form:
  "EqualityExpression3ExpressionRules0" (this, EqualityExpression, RelationalExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
