package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Expression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""Expression1ExpressionRules0""", List(Id("""this"""), Id("""Expression"""), Id("""AssignmentExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""HasCallInTailPosition""")).setId(45984), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(45985), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(45986), IReturn(ERef(RefId(Id("""__x2__""")))).setId(45987))).setId(-1))
  /* Beautified form:
  "Expression1ExpressionRules0" (this, Expression, AssignmentExpression) => {
    access __x0__ = (AssignmentExpression "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
