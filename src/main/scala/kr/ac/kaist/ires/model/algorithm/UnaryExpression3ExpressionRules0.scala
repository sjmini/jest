package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object UnaryExpression3ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression3ExpressionRules0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45698), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45699))).setId(-1))
  /* Beautified form:
  "UnaryExpression3ExpressionRules0" (this, UnaryExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
