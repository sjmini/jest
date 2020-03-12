package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UpdateExpression2AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""UpdateExpression2AssignmentTargetType0""", List(Id("""this"""), Id("""LeftHandSideExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(18680))
  val instToStepMap: Map[Int, Int] = Map(18680 -> 0, 18681 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(18681, 18680))
  /* Beautified form:
  "UpdateExpression2AssignmentTargetType0" (this, LeftHandSideExpression) => return CONST_invalid
  */
}
