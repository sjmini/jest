package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ConditionalExpression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""ConditionalExpression1AssignmentTargetType0""", List(Id("""this"""), Id("""LogicalORExpression"""), Id("""AssignmentExpression0"""), Id("""AssignmentExpression1""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(22499))
  val instToStepMap: Map[Int, Int] = Map(22499 -> 0, 22500 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(22499, 22500))
  /* Beautified form:
  "ConditionalExpression1AssignmentTargetType0" (this, LogicalORExpression, AssignmentExpression0, AssignmentExpression1) => return CONST_invalid
  */
}
