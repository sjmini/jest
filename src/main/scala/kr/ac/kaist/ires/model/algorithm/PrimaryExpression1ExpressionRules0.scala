package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression1ExpressionRules0""", List(Id("""this"""), Id("""IdentifierReference""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45858), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45859))).setId(-1))
  /* Beautified form:
  "PrimaryExpression1ExpressionRules0" (this, IdentifierReference) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
