package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ConditionalExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""ConditionalExpression1ExpressionRules0""", List(Id("""this"""), Id("""LogicalORExpression"""), Id("""AssignmentExpression0"""), Id("""AssignmentExpression1""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AssignmentExpression0"""))), EStr("""HasCallInTailPosition""")).setId(46000), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(46001), ILet(Id("""has"""), ERef(RefId(Id("""__x1__""")))).setId(46002), IIf(EBOp(OEq, ERef(RefId(Id("""has"""))), EBool(true)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(46004), IReturn(ERef(RefId(Id("""__x2__""")))).setId(46005))).setId(46006), ISeq(List()).setId(46007)).setId(46008), IAccess(Id("""__x3__"""), ERef(RefId(Id("""AssignmentExpression1"""))), EStr("""HasCallInTailPosition""")).setId(46010), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""call"""))))).setId(46011), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(46012), IReturn(ERef(RefId(Id("""__x5__""")))).setId(46013))).setId(-1))
  /* Beautified form:
  "ConditionalExpression1ExpressionRules0" (this, LogicalORExpression, AssignmentExpression0, AssignmentExpression1) => {
    access __x0__ = (AssignmentExpression0 "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    let has = __x1__
    if (= has true) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    access __x3__ = (AssignmentExpression1 "HasCallInTailPosition")
    app __x4__ = (__x3__ call)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
