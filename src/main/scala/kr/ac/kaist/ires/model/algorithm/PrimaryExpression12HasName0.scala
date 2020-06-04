package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression12HasName0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression12HasName0""", List(Id("""this"""), Id("""CoverParenthesizedExpressionAndArrowParameterList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverParenthesizedExpressionAndArrowParameterList"""))), EStr("""CoveredParenthesizedExpression""")).setId(13451), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))).setId(13452), IAccess(Id("""__x1__"""), ERef(RefId(Id("""expr"""))), EStr("""IsFunctionDefinition""")).setId(13454), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), IReturn(EBool(false)).setId(13455), ISeq(List()).setId(13457)).setId(13458), IAccess(Id("""__x2__"""), ERef(RefId(Id("""expr"""))), EStr("""HasName""")).setId(13460), IReturn(ERef(RefId(Id("""__x2__""")))).setId(13461))).setId(-1))
  /* Beautified form:
  "PrimaryExpression12HasName0" (this, CoverParenthesizedExpressionAndArrowParameterList) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredParenthesizedExpression")
    let expr = __x0__
    access __x1__ = (expr "IsFunctionDefinition")
    if (= __x1__ false) return false else {}
    access __x2__ = (expr "HasName")
    return __x2__
  }
  */
}
