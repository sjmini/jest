package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentExpression5IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression5IsFunctionDefinition0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentOperator"""), Id("""AssignmentExpression""")), None, IReturn(EBool(false)).setId(22648))
  val instToStepMap: Map[Int, Int] = Map(22648 -> 0, 22649 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(22649, 22648))
  /* Beautified form:
  "AssignmentExpression5IsFunctionDefinition0" (this, LeftHandSideExpression, AssignmentOperator, AssignmentExpression) => return false
  */
}
