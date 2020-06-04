package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression6ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression6ExpressionRules0""", List(Id("""this"""), Id("""ClassExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45908), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45909))).setId(-1))
  /* Beautified form:
  "PrimaryExpression6ExpressionRules0" (this, ClassExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
