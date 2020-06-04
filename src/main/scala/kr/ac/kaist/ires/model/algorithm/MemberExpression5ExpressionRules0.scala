package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MemberExpression5ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression5ExpressionRules0""", List(Id("""this"""), Id("""MetaProperty""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45828), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45829))).setId(-1))
  /* Beautified form:
  "MemberExpression5ExpressionRules0" (this, MetaProperty) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
