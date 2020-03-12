package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression5IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression5IsFunctionDefinition0""", List(Id("""this"""), Id("""UnaryExpression""")), None, IReturn(EBool(false)).setId(19043))
  val instToStepMap: Map[Int, Int] = Map(19043 -> 0, 19044 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19044, 19043))
  /* Beautified form:
  "UnaryExpression5IsFunctionDefinition0" (this, UnaryExpression) => return false
  */
}
