package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LogicalANDExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""LogicalANDExpression1ExpressionRules0""", List(Id("""this"""), Id("""LogicalANDExpression"""), Id("""BitwiseORExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BitwiseORExpression"""))), EStr("""HasCallInTailPosition""")).setId(46042), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(46043), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(46044), IReturn(ERef(RefId(Id("""__x2__""")))).setId(46045))).setId(-1))
  /* Beautified form:
  "LogicalANDExpression1ExpressionRules0" (this, LogicalANDExpression, BitwiseORExpression) => {
    access __x0__ = (BitwiseORExpression "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
