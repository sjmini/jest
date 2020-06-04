package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression12AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression12AssignmentTargetType0""", List(Id("""this"""), Id("""CoverParenthesizedExpressionAndArrowParameterList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverParenthesizedExpressionAndArrowParameterList"""))), EStr("""CoveredParenthesizedExpression""")).setId(13654), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))).setId(13655), IAccess(Id("""__x1__"""), ERef(RefId(Id("""expr"""))), EStr("""AssignmentTargetType""")).setId(13657), IReturn(ERef(RefId(Id("""__x1__""")))).setId(13658))).setId(-1))
  /* Beautified form:
  "PrimaryExpression12AssignmentTargetType0" (this, CoverParenthesizedExpressionAndArrowParameterList) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredParenthesizedExpression")
    let expr = __x0__
    access __x1__ = (expr "AssignmentTargetType")
    return __x1__
  }
  */
}
