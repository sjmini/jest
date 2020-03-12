package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression5IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression5IsFunctionDefinition0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, IReturn(EBool(false)).setId(20713))
  val instToStepMap: Map[Int, Int] = Map(20713 -> 0, 20714 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(20713, 20714))
  /* Beautified form:
  "RelationalExpression5IsFunctionDefinition0" (this, RelationalExpression, ShiftExpression) => return false
  */
}
