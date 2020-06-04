package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MemberExpression6ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression6ExpressionRules0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Arguments""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45838), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45839))).setId(-1))
  /* Beautified form:
  "MemberExpression6ExpressionRules0" (this, MemberExpression, Arguments) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
