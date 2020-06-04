package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression7ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression7ExpressionRules0""", List(Id("""this"""), Id("""GeneratorExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45918), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45919))).setId(-1))
  /* Beautified form:
  "PrimaryExpression7ExpressionRules0" (this, GeneratorExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
