package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ParenthesizedExpression0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ParenthesizedExpression0Evaluation0""", List(Id("""this"""), Id("""Expression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(16175), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(16176), IReturn(ERef(RefId(Id("""__x1__""")))).setId(16177))).setId(-1))
  /* Beautified form:
  "ParenthesizedExpression0Evaluation0" (this, Expression) => {
    access __x0__ = (Expression "Evaluation")
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
