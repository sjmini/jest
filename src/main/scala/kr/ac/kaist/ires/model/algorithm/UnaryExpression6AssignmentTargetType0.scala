package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression6AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression6AssignmentTargetType0""", List(Id("""this"""), Id("""UnaryExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(19088))
  val instToStepMap: Map[Int, Int] = Map(19088 -> 0, 19089 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19088, 19089))
  /* Beautified form:
  "UnaryExpression6AssignmentTargetType0" (this, UnaryExpression) => return CONST_invalid
  */
}
