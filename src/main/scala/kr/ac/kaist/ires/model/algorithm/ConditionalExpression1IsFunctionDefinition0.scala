package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ConditionalExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""ConditionalExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""LogicalORExpression"""), Id("""AssignmentExpression0"""), Id("""AssignmentExpression1""")), None, IReturn(EBool(false)).setId(22494))
  val instToStepMap: Map[Int, Int] = Map(22494 -> 0, 22495 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(22495, 22494))
  /* Beautified form:
  "ConditionalExpression1IsFunctionDefinition0" (this, LogicalORExpression, AssignmentExpression0, AssignmentExpression1) => return false
  */
}
