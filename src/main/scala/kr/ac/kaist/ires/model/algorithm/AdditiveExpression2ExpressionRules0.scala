package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AdditiveExpression2ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""AdditiveExpression2ExpressionRules0""", List(Id("""this"""), Id("""AdditiveExpression"""), Id("""MultiplicativeExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45608), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45609))).setId(-1))
  /* Beautified form:
  "AdditiveExpression2ExpressionRules0" (this, AdditiveExpression, MultiplicativeExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
