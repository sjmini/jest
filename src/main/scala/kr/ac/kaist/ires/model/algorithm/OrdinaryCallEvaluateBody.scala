package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object OrdinaryCallEvaluateBody {
  val length: Int = 2
  val func: Func = Func("""OrdinaryCallEvaluateBody""", List(Id("""F"""), Id("""argumentsList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefProp(RefId(Id("""F""")), EStr("""ECMAScriptCode"""))), EStr("""EvaluateBody""")).setId(51608), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""argumentsList"""))))).setId(51609), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(51610), IReturn(ERef(RefId(Id("""__x2__""")))).setId(51611))).setId(-1))
  /* Beautified form:
  "OrdinaryCallEvaluateBody" (F, argumentsList) => {
    access __x0__ = (F["ECMAScriptCode"] "EvaluateBody")
    app __x1__ = (__x0__ F argumentsList)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
