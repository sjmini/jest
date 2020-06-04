package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyDefinition2PropName0 {
  val length: Int = 0
  val func: Func = Func("""PropertyDefinition2PropName0""", List(Id("""this"""), Id("""PropertyName"""), Id("""AssignmentExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""PropName""")).setId(14475), IReturn(ERef(RefId(Id("""__x0__""")))).setId(14476))).setId(-1))
  /* Beautified form:
  "PropertyDefinition2PropName0" (this, PropertyName, AssignmentExpression) => {
    access __x0__ = (PropertyName "PropName")
    return __x0__
  }
  */
}
