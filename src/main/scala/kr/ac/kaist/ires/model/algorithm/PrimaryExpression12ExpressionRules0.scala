package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PrimaryExpression12ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression12ExpressionRules0""", List(Id("""this"""), Id("""CoverParenthesizedExpressionAndArrowParameterList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverParenthesizedExpressionAndArrowParameterList"""))), EStr("""CoveredParenthesizedExpression""")).setId(46178), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))).setId(46179), IAccess(Id("""__x1__"""), ERef(RefId(Id("""expr"""))), EStr("""HasCallInTailPosition""")).setId(46181), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""call"""))))).setId(46182), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(46183), IReturn(ERef(RefId(Id("""__x3__""")))).setId(46184))).setId(-1))
  /* Beautified form:
  "PrimaryExpression12ExpressionRules0" (this, CoverParenthesizedExpressionAndArrowParameterList) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredParenthesizedExpression")
    let expr = __x0__
    access __x1__ = (expr "HasCallInTailPosition")
    app __x2__ = (__x1__ call)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
