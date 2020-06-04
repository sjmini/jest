package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertySetParameterList0ExpectedArgumentCount0 {
  val length: Int = 0
  val func: Func = Func("""PropertySetParameterList0ExpectedArgumentCount0""", List(Id("""this"""), Id("""FormalParameter""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FormalParameter"""))), EStr("""HasInitializer""")).setId(39467), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), IReturn(EINum(0L)).setId(39468), ISeq(List()).setId(39470)).setId(39471), IReturn(EINum(1L)).setId(39473))).setId(-1))
  /* Beautified form:
  "PropertySetParameterList0ExpectedArgumentCount0" (this, FormalParameter) => {
    access __x0__ = (FormalParameter "HasInitializer")
    if (= __x0__ true) return 0i else {}
    return 1i
  }
  */
}
