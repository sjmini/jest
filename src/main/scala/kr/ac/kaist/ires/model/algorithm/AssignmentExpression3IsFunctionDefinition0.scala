package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentExpression3IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression3IsFunctionDefinition0""", List(Id("""this"""), Id("""AsyncArrowFunction""")), None, IReturn(EBool(true)).setId(22633))
  val instToStepMap: Map[Int, Int] = Map(22633 -> 0, 22634 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(22634, 22633))
  /* Beautified form:
  "AssignmentExpression3IsFunctionDefinition0" (this, AsyncArrowFunction) => return true
  */
}
