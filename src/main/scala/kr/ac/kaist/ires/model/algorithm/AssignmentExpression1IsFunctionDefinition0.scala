package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""YieldExpression""")), None, IReturn(EBool(false)).setId(22638))
  val instToStepMap: Map[Int, Int] = Map(22638 -> 0, 22639 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(22638, 22639))
  /* Beautified form:
  "AssignmentExpression1IsFunctionDefinition0" (this, YieldExpression) => return false
  */
}
