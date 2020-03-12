package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression6IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression6IsFunctionDefinition0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, IReturn(EBool(false)).setId(20718))
  val instToStepMap: Map[Int, Int] = Map(20718 -> 0, 20719 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(20719, 20718))
  /* Beautified form:
  "RelationalExpression6IsFunctionDefinition0" (this, RelationalExpression, ShiftExpression) => return false
  */
}
