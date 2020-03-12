package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UpdateExpression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""UpdateExpression1AssignmentTargetType0""", List(Id("""this"""), Id("""LeftHandSideExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(18675))
  val instToStepMap: Map[Int, Int] = Map(18675 -> 0, 18676 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(18676, 18675))
  /* Beautified form:
  "UpdateExpression1AssignmentTargetType0" (this, LeftHandSideExpression) => return CONST_invalid
  */
}
