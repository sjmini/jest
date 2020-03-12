package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LogicalANDExpression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""LogicalANDExpression1AssignmentTargetType0""", List(Id("""this"""), Id("""LogicalANDExpression"""), Id("""BitwiseORExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(22282))
  val instToStepMap: Map[Int, Int] = Map(22282 -> 0, 22283 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(22282, 22283))
  /* Beautified form:
  "LogicalANDExpression1AssignmentTargetType0" (this, LogicalANDExpression, BitwiseORExpression) => return CONST_invalid
  */
}
