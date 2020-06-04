package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object LogicalORExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""LogicalORExpression1ExpressionRules0""", List(Id("""this"""), Id("""LogicalORExpression"""), Id("""LogicalANDExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LogicalANDExpression"""))), EStr("""HasCallInTailPosition""")).setId(46058), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(46059), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(46060), IReturn(ERef(RefId(Id("""__x2__""")))).setId(46061))).setId(-1))
  /* Beautified form:
  "LogicalORExpression1ExpressionRules0" (this, LogicalORExpression, LogicalANDExpression) => {
    access __x0__ = (LogicalANDExpression "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
