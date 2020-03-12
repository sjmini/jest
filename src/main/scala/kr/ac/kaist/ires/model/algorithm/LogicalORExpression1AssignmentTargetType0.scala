package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LogicalORExpression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""LogicalORExpression1AssignmentTargetType0""", List(Id("""this"""), Id("""LogicalORExpression"""), Id("""LogicalANDExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(22287))
  val instToStepMap: Map[Int, Int] = Map(22288 -> 0, 22287 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(22287, 22288))
  /* Beautified form:
  "LogicalORExpression1AssignmentTargetType0" (this, LogicalORExpression, LogicalANDExpression) => return CONST_invalid
  */
}
