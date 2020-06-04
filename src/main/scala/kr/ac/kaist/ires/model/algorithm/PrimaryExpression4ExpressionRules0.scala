package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression4ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression4ExpressionRules0""", List(Id("""this"""), Id("""ObjectLiteral""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45888), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45889))).setId(-1))
  /* Beautified form:
  "PrimaryExpression4ExpressionRules0" (this, ObjectLiteral) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
