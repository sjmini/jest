package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression6ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression6ExpressionRules0""", List(Id("""this"""), Id("""CallExpression"""), Id("""TemplateLiteral""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""this"""))), ERef(RefId(Id("""call""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(46126), IReturn(ERef(RefId(Id("""__x0__""")))).setId(46127))).setId(46128), ISeq(List()).setId(46129)).setId(46130), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(46132), IReturn(ERef(RefId(Id("""__x1__""")))).setId(46133))).setId(-1))
  /* Beautified form:
  "CallExpression6ExpressionRules0" (this, CallExpression, TemplateLiteral) => {
    if (= this call) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}
