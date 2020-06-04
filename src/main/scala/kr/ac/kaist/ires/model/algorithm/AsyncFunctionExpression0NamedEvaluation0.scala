package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncFunctionExpression0NamedEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""AsyncFunctionExpression0NamedEvaluation0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncFunctionBody"""), Id("""name""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""Evaluation""")).setId(43835), ILet(Id("""closure"""), ERef(RefId(Id("""__x0__""")))).setId(43836), IApp(Id("""__x1__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""name"""))))).setId(43838), IExpr(ERef(RefId(Id("""__x1__""")))).setId(43839), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(43841), IReturn(ERef(RefId(Id("""__x2__""")))).setId(43842))).setId(-1))
  /* Beautified form:
  "AsyncFunctionExpression0NamedEvaluation0" (this, FormalParameters, AsyncFunctionBody, name) => {
    access __x0__ = (this "Evaluation")
    let closure = __x0__
    app __x1__ = (SetFunctionName closure name)
    __x1__
    app __x2__ = (WrapCompletion closure)
    return __x2__
  }
  */
}
