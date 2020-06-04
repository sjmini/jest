package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UnaryExpression6ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression6ExpressionRules0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45728), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45729))).setId(-1))
  /* Beautified form:
  "UnaryExpression6ExpressionRules0" (this, UnaryExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
