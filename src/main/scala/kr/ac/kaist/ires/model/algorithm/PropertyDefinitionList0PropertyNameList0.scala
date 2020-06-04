package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object PropertyDefinitionList0PropertyNameList0 {
  val length: Int = 0
  val func: Func = Func("""PropertyDefinitionList0PropertyNameList0""", List(Id("""this"""), Id("""PropertyDefinition""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyDefinition"""))), EStr("""PropName""")).setId(14542), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""CONST_empty""")))), IReturn(EList(List())).setId(14543), ISeq(List()).setId(14545)).setId(14546), IAccess(Id("""__x1__"""), ERef(RefId(Id("""PropertyDefinition"""))), EStr("""PropName""")).setId(14548), IReturn(EList(List(ERef(RefId(Id("""__x1__""")))))).setId(14549))).setId(-1))
  /* Beautified form:
  "PropertyDefinitionList0PropertyNameList0" (this, PropertyDefinition) => {
    access __x0__ = (PropertyDefinition "PropName")
    if (= __x0__ CONST_empty) return (new []) else {}
    access __x1__ = (PropertyDefinition "PropName")
    return (new [__x1__])
  }
  */
}
