package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, IReturn(EBool(false)).setId(20693))
  val instToStepMap: Map[Int, Int] = Map(20693 -> 0, 20694 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(20694, 20693))
  /* Beautified form:
  "RelationalExpression1IsFunctionDefinition0" (this, RelationalExpression, ShiftExpression) => return false
  */
}
