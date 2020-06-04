package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncConciseBody1EvaluateBody0 {
  val length: Int = 0
  val func: Func = Func("""AsyncConciseBody1EvaluateBody0""", List(Id("""this"""), Id("""AsyncFunctionBody"""), Id("""functionObject"""), Id("""argumentsList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AsyncFunctionBody"""))), EStr("""EvaluateBody""")).setId(44488), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""functionObject"""))), ERef(RefId(Id("""argumentsList"""))))).setId(44489), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(44490), IReturn(ERef(RefId(Id("""__x2__""")))).setId(44491))).setId(-1))
  /* Beautified form:
  "AsyncConciseBody1EvaluateBody0" (this, AsyncFunctionBody, functionObject, argumentsList) => {
    access __x0__ = (AsyncFunctionBody "EvaluateBody")
    app __x1__ = (__x0__ functionObject argumentsList)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
