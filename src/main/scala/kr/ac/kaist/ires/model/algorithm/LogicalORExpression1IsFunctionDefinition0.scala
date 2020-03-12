package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LogicalORExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""LogicalORExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""LogicalORExpression"""), Id("""LogicalANDExpression""")), None, IReturn(EBool(false)).setId(22277))
  val instToStepMap: Map[Int, Int] = Map(22277 -> 0, 22278 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(22278, 22277))
  /* Beautified form:
  "LogicalORExpression1IsFunctionDefinition0" (this, LogicalORExpression, LogicalANDExpression) => return false
  */
}
