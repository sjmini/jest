package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LogicalANDExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""LogicalANDExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""LogicalANDExpression"""), Id("""BitwiseORExpression""")), None, IReturn(EBool(false)).setId(22272))
  val instToStepMap: Map[Int, Int] = Map(22272 -> 0, 22273 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(22272, 22273))
  /* Beautified form:
  "LogicalANDExpression1IsFunctionDefinition0" (this, LogicalANDExpression, BitwiseORExpression) => return false
  */
}
