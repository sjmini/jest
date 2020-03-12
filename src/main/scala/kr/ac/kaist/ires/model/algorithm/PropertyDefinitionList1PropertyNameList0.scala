package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PropertyDefinitionList1PropertyNameList0 {
  val length: Int = 0
  val func: Func = Func("""PropertyDefinitionList1PropertyNameList0""", List(Id("""this"""), Id("""PropertyDefinitionList"""), Id("""PropertyDefinition""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyDefinitionList"""))), EStr("""PropertyNameList""")).setId(14566), ILet(Id("""list"""), ERef(RefId(Id("""__x0__""")))).setId(14567), IAccess(Id("""__x1__"""), ERef(RefId(Id("""PropertyDefinition"""))), EStr("""PropName""")).setId(14569), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""CONST_empty""")))), IReturn(ERef(RefId(Id("""list""")))).setId(14570), ISeq(List()).setId(14585)).setId(14573), IAccess(Id("""__x2__"""), ERef(RefId(Id("""PropertyDefinition"""))), EStr("""PropName""")).setId(14575), IAppend(ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""list""")))).setId(14576), IReturn(ERef(RefId(Id("""list""")))).setId(14578))).setId(14590))
  val instToStepMap: Map[Int, Int] = HashMap(14574 -> 2, 14570 -> 1, 14579 -> 4, 14569 -> 2, 14566 -> 0, 14573 -> 2, 14576 -> 3, 14577 -> 3, 14567 -> 0, 14571 -> 1, 14575 -> 3, 14578 -> 4, 14568 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(14566, 14567, 14568), 1 -> HashSet(14570, 14571), 2 -> HashSet(14574, 14569, 14573), 3 -> HashSet(14576, 14577, 14575), 4 -> HashSet(14579, 14578))
  /* Beautified form:
  "PropertyDefinitionList1PropertyNameList0" (this, PropertyDefinitionList, PropertyDefinition) => {
    access __x0__ = (PropertyDefinitionList "PropertyNameList")
    let list = __x0__
    access __x1__ = (PropertyDefinition "PropName")
    if (= __x1__ CONST_empty) return list else {}
    access __x2__ = (PropertyDefinition "PropName")
    append __x2__ -> list
    return list
  }
  */
}
