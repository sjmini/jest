package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression1AssignmentTargetType0""", List(Id("""this"""), Id("""UnaryExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(19063))
  val instToStepMap: Map[Int, Int] = Map(19063 -> 0, 19064 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19063, 19064))
  /* Beautified form:
  "UnaryExpression1AssignmentTargetType0" (this, UnaryExpression) => return CONST_invalid
  */
}
