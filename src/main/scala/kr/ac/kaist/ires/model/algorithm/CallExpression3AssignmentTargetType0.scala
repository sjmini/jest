package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CallExpression3AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression3AssignmentTargetType0""", List(Id("""this"""), Id("""CallExpression"""), Id("""Arguments""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(16494))
  val instToStepMap: Map[Int, Int] = Map(16494 -> 0, 16495 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16495, 16494))
  /* Beautified form:
  "CallExpression3AssignmentTargetType0" (this, CallExpression, Arguments) => return CONST_invalid
  */
}
