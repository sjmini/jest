package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameterList1ContainsExpression0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameterList1ContainsExpression0""", List(Id("""this"""), Id("""FormalParameterList"""), Id("""FormalParameter""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FormalParameterList"""))), EStr("""ContainsExpression""")).setId(37844), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), IReturn(EBool(true)).setId(37845), ISeq(List()).setId(37847)).setId(37848), IAccess(Id("""__x1__"""), ERef(RefId(Id("""FormalParameter"""))), EStr("""ContainsExpression""")).setId(37850), IReturn(ERef(RefId(Id("""__x1__""")))).setId(37851))).setId(-1))
  /* Beautified form:
  "FormalParameterList1ContainsExpression0" (this, FormalParameterList, FormalParameter) => {
    access __x0__ = (FormalParameterList "ContainsExpression")
    if (= __x0__ true) return true else {}
    access __x1__ = (FormalParameter "ContainsExpression")
    return __x1__
  }
  */
}
