package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ExponentiationExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""ExponentiationExpression1ExpressionRules0""", List(Id("""this"""), Id("""UpdateExpression"""), Id("""ExponentiationExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45628), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45629))).setId(-1))
  /* Beautified form:
  "ExponentiationExpression1ExpressionRules0" (this, UpdateExpression, ExponentiationExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
