package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MemberExpression3ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression3ExpressionRules0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""TemplateLiteral""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""this"""))), ERef(RefId(Id("""call""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(46152), IReturn(ERef(RefId(Id("""__x0__""")))).setId(46153))).setId(46154), ISeq(List()).setId(46155)).setId(46156), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(46158), IReturn(ERef(RefId(Id("""__x1__""")))).setId(46159))).setId(-1))
  /* Beautified form:
  "MemberExpression3ExpressionRules0" (this, MemberExpression, TemplateLiteral) => {
    if (= this call) {
      app __x0__ = (WrapCompletion true)
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion false)
    return __x1__
  }
  */
}
