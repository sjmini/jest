package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MemberExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression1ExpressionRules0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Expression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))), IReturn(ERef(RefId(Id("""__x0__""")))))))
  /* Beautified form:
  "MemberExpression1ExpressionRules0" (this, MemberExpression, Expression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}