package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BitwiseXORExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""BitwiseXORExpression1ExpressionRules0""", List(Id("""this"""), Id("""BitwiseXORExpression"""), Id("""BitwiseANDExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45448), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45449))).setId(-1))
  /* Beautified form:
  "BitwiseXORExpression1ExpressionRules0" (this, BitwiseXORExpression, BitwiseANDExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
