package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EqualityExpression4AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""EqualityExpression4AssignmentTargetType0""", List(Id("""this"""), Id("""EqualityExpression"""), Id("""RelationalExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(21556))
  val instToStepMap: Map[Int, Int] = Map(21556 -> 0, 21557 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(21556, 21557))
  /* Beautified form:
  "EqualityExpression4AssignmentTargetType0" (this, EqualityExpression, RelationalExpression) => return CONST_invalid
  */
}
