package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression3ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression3ExpressionRules0""", List(Id("""this"""), Id("""CallExpression"""), Id("""Arguments""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""this"""))), ERef(RefId(Id("""call""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(46100), IReturn(ERef(RefId(Id("""__x0__""")))).setId(46101))).setId(46102), ISeq(List()).setId(46103)).setId(46104), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(46106), IReturn(ERef(RefId(Id("""__x1__""")))).setId(46107))).setId(-1))
  /* Beautified form:
  "CallExpression3ExpressionRules0" (this, CallExpression, Arguments) => {
    if (= this call) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}
