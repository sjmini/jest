package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentExpression4IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression4IsFunctionDefinition0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentExpression""")), None, IReturn(EBool(false)).setId(22643))
  val instToStepMap: Map[Int, Int] = Map(22643 -> 0, 22644 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(22644, 22643))
  /* Beautified form:
  "AssignmentExpression4IsFunctionDefinition0" (this, LeftHandSideExpression, AssignmentExpression) => return false
  */
}
