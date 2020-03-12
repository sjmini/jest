package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentExpression5AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression5AssignmentTargetType0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentOperator"""), Id("""AssignmentExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(22673))
  val instToStepMap: Map[Int, Int] = Map(22673 -> 0, 22674 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(22674, 22673))
  /* Beautified form:
  "AssignmentExpression5AssignmentTargetType0" (this, LeftHandSideExpression, AssignmentOperator, AssignmentExpression) => return CONST_invalid
  */
}
