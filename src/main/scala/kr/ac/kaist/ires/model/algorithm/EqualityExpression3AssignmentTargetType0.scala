package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EqualityExpression3AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""EqualityExpression3AssignmentTargetType0""", List(Id("""this"""), Id("""EqualityExpression"""), Id("""RelationalExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(21551))
  val instToStepMap: Map[Int, Int] = Map(21552 -> 0, 21551 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(21551, 21552))
  /* Beautified form:
  "EqualityExpression3AssignmentTargetType0" (this, EqualityExpression, RelationalExpression) => return CONST_invalid
  */
}
