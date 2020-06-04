package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ParenthesizedExpression0ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""ParenthesizedExpression0ExpressionRules0""", List(Id("""this"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""HasCallInTailPosition""")).setId(46201), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(46202), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(46203), IReturn(ERef(RefId(Id("""__x2__""")))).setId(46204))).setId(-1))
  /* Beautified form:
  "ParenthesizedExpression0ExpressionRules0" (this, Expression) => {
    access __x0__ = (Expression "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
