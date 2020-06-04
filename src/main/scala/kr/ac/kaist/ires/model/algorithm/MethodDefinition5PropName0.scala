package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object MethodDefinition5PropName0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition5PropName0""", List(Id("""this"""), Id("""PropertyName"""), Id("""PropertySetParameterList"""), Id("""FunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""PropName""")).setId(39581), IReturn(ERef(RefId(Id("""__x0__""")))).setId(39582))).setId(-1))
  /* Beautified form:
  "MethodDefinition5PropName0" (this, PropertyName, PropertySetParameterList, FunctionBody) => {
    access __x0__ = (PropertyName "PropName")
    return __x0__
  }
  */
}
