package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UpdateExpression4AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""UpdateExpression4AssignmentTargetType0""", List(Id("""this"""), Id("""UnaryExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(18690))
  val instToStepMap: Map[Int, Int] = Map(18690 -> 0, 18691 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(18691, 18690))
  /* Beautified form:
  "UpdateExpression4AssignmentTargetType0" (this, UnaryExpression) => return CONST_invalid
  */
}
