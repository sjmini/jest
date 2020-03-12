package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EqualityExpression2AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""EqualityExpression2AssignmentTargetType0""", List(Id("""this"""), Id("""EqualityExpression"""), Id("""RelationalExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(21546))
  val instToStepMap: Map[Int, Int] = Map(21546 -> 0, 21547 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(21547, 21546))
  /* Beautified form:
  "EqualityExpression2AssignmentTargetType0" (this, EqualityExpression, RelationalExpression) => return CONST_invalid
  */
}
