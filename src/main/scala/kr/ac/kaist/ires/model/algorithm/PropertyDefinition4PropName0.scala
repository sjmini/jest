package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PropertyDefinition4PropName0 {
  val length: Int = 0
  val func: Func = Func("""PropertyDefinition4PropName0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, IReturn(ERef(RefId(Id("""CONST_empty""")))).setId(14470))
  val instToStepMap: Map[Int, Int] = Map(14470 -> 0, 14471 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14471, 14470))
  /* Beautified form:
  "PropertyDefinition4PropName0" (this, AssignmentExpression) => return CONST_empty
  */
}
