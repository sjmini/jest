package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameters4ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameters4ContainsExpression0""", List(Id("""this"""), Id("""FormalParameterList"""), Id("""FunctionRestParameter""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FormalParameterList"""))), EStr("""ContainsExpression""")).setId(37820), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), IReturn(EBool(true)).setId(37821), ISeq(List()).setId(37823)).setId(37824), IAccess(Id("""__x1__"""), ERef(RefId(Id("""FunctionRestParameter"""))), EStr("""ContainsExpression""")).setId(37826), IReturn(ERef(RefId(Id("""__x1__""")))).setId(37827))).setId(-1))
  /* Beautified form:
  "FormalParameters4ContainsExpression0" (this, FormalParameterList, FunctionRestParameter) => {
    access __x0__ = (FormalParameterList "ContainsExpression")
    if (= __x0__ true) return true else {}
    access __x1__ = (FunctionRestParameter "ContainsExpression")
    return __x1__
  }
  */
}
