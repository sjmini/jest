package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ShiftExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""ShiftExpression1ExpressionRules0""", List(Id("""this"""), Id("""ShiftExpression"""), Id("""AdditiveExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45568), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45569))).setId(-1))
  /* Beautified form:
  "ShiftExpression1ExpressionRules0" (this, ShiftExpression, AdditiveExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
