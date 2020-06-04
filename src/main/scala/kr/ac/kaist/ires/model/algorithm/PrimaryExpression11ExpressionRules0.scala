package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression11ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression11ExpressionRules0""", List(Id("""this"""), Id("""TemplateLiteral""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45958), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45959))).setId(-1))
  /* Beautified form:
  "PrimaryExpression11ExpressionRules0" (this, TemplateLiteral) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
