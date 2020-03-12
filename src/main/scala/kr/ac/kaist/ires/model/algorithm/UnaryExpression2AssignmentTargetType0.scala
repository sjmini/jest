package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression2AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression2AssignmentTargetType0""", List(Id("""this"""), Id("""UnaryExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(19068))
  val instToStepMap: Map[Int, Int] = Map(19068 -> 0, 19069 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19069, 19068))
  /* Beautified form:
  "UnaryExpression2AssignmentTargetType0" (this, UnaryExpression) => return CONST_invalid
  */
}
