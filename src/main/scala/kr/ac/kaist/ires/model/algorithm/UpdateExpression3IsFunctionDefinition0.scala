package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UpdateExpression3IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""UpdateExpression3IsFunctionDefinition0""", List(Id("""this"""), Id("""UnaryExpression""")), None, IReturn(EBool(false)).setId(18665))
  val instToStepMap: Map[Int, Int] = Map(18665 -> 0, 18666 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(18665, 18666))
  /* Beautified form:
  "UpdateExpression3IsFunctionDefinition0" (this, UnaryExpression) => return false
  */
}
