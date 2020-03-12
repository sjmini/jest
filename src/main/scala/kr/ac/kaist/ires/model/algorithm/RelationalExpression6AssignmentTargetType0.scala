package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression6AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression6AssignmentTargetType0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(20748))
  val instToStepMap: Map[Int, Int] = Map(20748 -> 0, 20749 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(20748, 20749))
  /* Beautified form:
  "RelationalExpression6AssignmentTargetType0" (this, RelationalExpression, ShiftExpression) => return CONST_invalid
  */
}
