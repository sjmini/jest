package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CallExpression0ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression0ExpressionRules0""", List(Id("""this"""), Id("""CoverCallExpressionAndAsyncArrowHead""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""this"""))), ERef(RefId(Id("""call""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(46074), IReturn(ERef(RefId(Id("""__x0__""")))).setId(46075))).setId(46076), ISeq(List()).setId(46077)).setId(46078), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(46080), IReturn(ERef(RefId(Id("""__x1__""")))).setId(46081))).setId(-1))
  /* Beautified form:
  "CallExpression0ExpressionRules0" (this, CoverCallExpressionAndAsyncArrowHead) => {
    if (= this call) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}
