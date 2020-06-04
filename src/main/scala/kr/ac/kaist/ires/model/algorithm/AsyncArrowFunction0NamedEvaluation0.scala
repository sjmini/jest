package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncArrowFunction0NamedEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""AsyncArrowFunction0NamedEvaluation0""", List(Id("""this"""), Id("""AsyncArrowBindingIdentifier"""), Id("""AsyncConciseBody"""), Id("""name""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""this"""))), EStr("""Evaluation""")).setId(44505), ILet(Id("""closure"""), ERef(RefId(Id("""__x0__""")))).setId(44506), IApp(Id("""__x1__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""closure"""))), ERef(RefId(Id("""name"""))))).setId(44508), IExpr(ERef(RefId(Id("""__x1__""")))).setId(44509), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(44511), IReturn(ERef(RefId(Id("""__x2__""")))).setId(44512))).setId(-1))
  /* Beautified form:
  "AsyncArrowFunction0NamedEvaluation0" (this, AsyncArrowBindingIdentifier, AsyncConciseBody, name) => {
    access __x0__ = (this "Evaluation")
    let closure = __x0__
    app __x1__ = (SetFunctionName closure name)
    __x1__
    app __x2__ = (WrapCompletion closure)
    return __x2__
  }
  */
}
