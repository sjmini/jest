package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression7AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression7AssignmentTargetType0""", List(Id("""this"""), Id("""UnaryExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(19093))
  val instToStepMap: Map[Int, Int] = Map(19093 -> 0, 19094 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19094, 19093))
  /* Beautified form:
  "UnaryExpression7AssignmentTargetType0" (this, UnaryExpression) => return CONST_invalid
  */
}
