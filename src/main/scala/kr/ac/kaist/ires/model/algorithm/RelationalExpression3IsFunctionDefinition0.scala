package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression3IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression3IsFunctionDefinition0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, IReturn(EBool(false)).setId(20703))
  val instToStepMap: Map[Int, Int] = Map(20704 -> 0, 20703 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(20704, 20703))
  /* Beautified form:
  "RelationalExpression3IsFunctionDefinition0" (this, RelationalExpression, ShiftExpression) => return false
  */
}
