package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentExpression4AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression4AssignmentTargetType0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(22668))
  val instToStepMap: Map[Int, Int] = Map(22668 -> 0, 22669 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(22669, 22668))
  /* Beautified form:
  "AssignmentExpression4AssignmentTargetType0" (this, LeftHandSideExpression, AssignmentExpression) => return CONST_invalid
  */
}
