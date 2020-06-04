package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MethodDefinition4PropName0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition4PropName0""", List(Id("""this"""), Id("""PropertyName"""), Id("""FunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""PropName""")).setId(39571), IReturn(ERef(RefId(Id("""__x0__""")))).setId(39572))).setId(-1))
  /* Beautified form:
  "MethodDefinition4PropName0" (this, PropertyName, FunctionBody) => {
    access __x0__ = (PropertyName "PropName")
    return __x0__
  }
  */
}
