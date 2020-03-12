package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression3IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression3IsFunctionDefinition0""", List(Id("""this"""), Id("""UnaryExpression""")), None, IReturn(EBool(false)).setId(19033))
  val instToStepMap: Map[Int, Int] = Map(19033 -> 0, 19034 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19033, 19034))
  /* Beautified form:
  "UnaryExpression3IsFunctionDefinition0" (this, UnaryExpression) => return false
  */
}
