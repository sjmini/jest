package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UpdateExpression3AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""UpdateExpression3AssignmentTargetType0""", List(Id("""this"""), Id("""UnaryExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(18685))
  val instToStepMap: Map[Int, Int] = Map(18685 -> 0, 18686 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(18685, 18686))
  /* Beautified form:
  "UpdateExpression3AssignmentTargetType0" (this, UnaryExpression) => return CONST_invalid
  */
}
