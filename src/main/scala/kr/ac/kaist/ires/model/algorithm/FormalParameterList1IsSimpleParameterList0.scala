package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object FormalParameterList1IsSimpleParameterList0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameterList1IsSimpleParameterList0""", List(Id("""this"""), Id("""FormalParameterList"""), Id("""FormalParameter""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FormalParameterList"""))), EStr("""IsSimpleParameterList""")).setId(38036), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false)), IReturn(EBool(false)).setId(38037), ISeq(List()).setId(38039)).setId(38040), IAccess(Id("""__x1__"""), ERef(RefId(Id("""FormalParameter"""))), EStr("""IsSimpleParameterList""")).setId(38042), IReturn(ERef(RefId(Id("""__x1__""")))).setId(38043))).setId(-1))
  /* Beautified form:
  "FormalParameterList1IsSimpleParameterList0" (this, FormalParameterList, FormalParameter) => {
    access __x0__ = (FormalParameterList "IsSimpleParameterList")
    if (= __x0__ false) return false else {}
    access __x1__ = (FormalParameter "IsSimpleParameterList")
    return __x1__
  }
  */
}
