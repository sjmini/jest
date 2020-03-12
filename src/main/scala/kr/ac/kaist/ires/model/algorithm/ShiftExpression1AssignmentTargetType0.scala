package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ShiftExpression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""ShiftExpression1AssignmentTargetType0""", List(Id("""this"""), Id("""ShiftExpression"""), Id("""AdditiveExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(20333))
  val instToStepMap: Map[Int, Int] = Map(20333 -> 0, 20334 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(20334, 20333))
  /* Beautified form:
  "ShiftExpression1AssignmentTargetType0" (this, ShiftExpression, AdditiveExpression) => return CONST_invalid
  */
}
