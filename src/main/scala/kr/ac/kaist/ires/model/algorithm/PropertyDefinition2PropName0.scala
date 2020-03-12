package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PropertyDefinition2PropName0 {
  val length: Int = 0
  val func: Func = Func("""PropertyDefinition2PropName0""", List(Id("""this"""), Id("""PropertyName"""), Id("""AssignmentExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertyName"""))), EStr("""PropName""")).setId(14475), IReturn(ERef(RefId(Id("""__x0__""")))).setId(14476))).setId(14481))
  val instToStepMap: Map[Int, Int] = Map(14475 -> 0, 14476 -> 0, 14477 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14477, 14476, 14475))
  /* Beautified form:
  "PropertyDefinition2PropName0" (this, PropertyName, AssignmentExpression) => {
    access __x0__ = (PropertyName "PropName")
    return __x0__
  }
  */
}
