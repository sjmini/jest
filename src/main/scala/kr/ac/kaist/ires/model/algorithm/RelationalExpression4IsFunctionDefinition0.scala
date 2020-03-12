package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression4IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression4IsFunctionDefinition0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, IReturn(EBool(false)).setId(20708))
  val instToStepMap: Map[Int, Int] = Map(20708 -> 0, 20709 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(20709, 20708))
  /* Beautified form:
  "RelationalExpression4IsFunctionDefinition0" (this, RelationalExpression, ShiftExpression) => return false
  */
}
