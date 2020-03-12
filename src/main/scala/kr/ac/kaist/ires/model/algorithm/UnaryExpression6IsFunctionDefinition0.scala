package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression6IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression6IsFunctionDefinition0""", List(Id("""this"""), Id("""UnaryExpression""")), None, IReturn(EBool(false)).setId(19048))
  val instToStepMap: Map[Int, Int] = Map(19048 -> 0, 19049 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19048, 19049))
  /* Beautified form:
  "UnaryExpression6IsFunctionDefinition0" (this, UnaryExpression) => return false
  */
}
