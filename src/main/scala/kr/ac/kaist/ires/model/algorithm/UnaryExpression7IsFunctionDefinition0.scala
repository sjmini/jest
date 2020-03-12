package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression7IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression7IsFunctionDefinition0""", List(Id("""this"""), Id("""UnaryExpression""")), None, IReturn(EBool(false)).setId(19053))
  val instToStepMap: Map[Int, Int] = Map(19053 -> 0, 19054 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19053, 19054))
  /* Beautified form:
  "UnaryExpression7IsFunctionDefinition0" (this, UnaryExpression) => return false
  */
}
