package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentExpression3AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression3AssignmentTargetType0""", List(Id("""this"""), Id("""AsyncArrowFunction""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(22663))
  val instToStepMap: Map[Int, Int] = Map(22663 -> 0, 22664 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(22663, 22664))
  /* Beautified form:
  "AssignmentExpression3AssignmentTargetType0" (this, AsyncArrowFunction) => return CONST_invalid
  */
}
