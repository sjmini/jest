package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression5AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression5AssignmentTargetType0""", List(Id("""this"""), Id("""UnaryExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(19083))
  val instToStepMap: Map[Int, Int] = Map(19083 -> 0, 19084 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19084, 19083))
  /* Beautified form:
  "UnaryExpression5AssignmentTargetType0" (this, UnaryExpression) => return CONST_invalid
  */
}
