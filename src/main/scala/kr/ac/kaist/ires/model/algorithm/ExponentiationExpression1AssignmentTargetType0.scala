package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ExponentiationExpression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""ExponentiationExpression1AssignmentTargetType0""", List(Id("""this"""), Id("""UpdateExpression"""), Id("""ExponentiationExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(19714))
  val instToStepMap: Map[Int, Int] = Map(19714 -> 0, 19715 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19714, 19715))
  /* Beautified form:
  "ExponentiationExpression1AssignmentTargetType0" (this, UpdateExpression, ExponentiationExpression) => return CONST_invalid
  */
}
