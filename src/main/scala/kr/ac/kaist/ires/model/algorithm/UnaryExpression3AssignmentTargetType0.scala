package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression3AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression3AssignmentTargetType0""", List(Id("""this"""), Id("""UnaryExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(19073))
  val instToStepMap: Map[Int, Int] = Map(19073 -> 0, 19074 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19074, 19073))
  /* Beautified form:
  "UnaryExpression3AssignmentTargetType0" (this, UnaryExpression) => return CONST_invalid
  */
}
