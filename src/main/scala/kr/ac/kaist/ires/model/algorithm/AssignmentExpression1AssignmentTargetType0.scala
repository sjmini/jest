package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentExpression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression1AssignmentTargetType0""", List(Id("""this"""), Id("""YieldExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(22653))
  val instToStepMap: Map[Int, Int] = Map(22653 -> 0, 22654 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(22653, 22654))
  /* Beautified form:
  "AssignmentExpression1AssignmentTargetType0" (this, YieldExpression) => return CONST_invalid
  */
}
