package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MemberExpression4ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression4ExpressionRules0""", List(Id("""this"""), Id("""SuperProperty""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45818), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45819))).setId(-1))
  /* Beautified form:
  "MemberExpression4ExpressionRules0" (this, SuperProperty) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
