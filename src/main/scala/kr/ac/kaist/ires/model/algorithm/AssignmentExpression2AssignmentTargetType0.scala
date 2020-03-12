package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentExpression2AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression2AssignmentTargetType0""", List(Id("""this"""), Id("""ArrowFunction""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(22658))
  val instToStepMap: Map[Int, Int] = Map(22658 -> 0, 22659 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(22659, 22658))
  /* Beautified form:
  "AssignmentExpression2AssignmentTargetType0" (this, ArrowFunction) => return CONST_invalid
  */
}
