package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AdditiveExpression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""AdditiveExpression1AssignmentTargetType0""", List(Id("""this"""), Id("""AdditiveExpression"""), Id("""MultiplicativeExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(19964))
  val instToStepMap: Map[Int, Int] = Map(19964 -> 0, 19965 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19964, 19965))
  /* Beautified form:
  "AdditiveExpression1AssignmentTargetType0" (this, AdditiveExpression, MultiplicativeExpression) => return CONST_invalid
  */
}
