package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression0ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression0ExpressionRules0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45848), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45849))).setId(-1))
  /* Beautified form:
  "PrimaryExpression0ExpressionRules0" (this) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
