package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UpdateExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""UpdateExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""LeftHandSideExpression""")), None, IReturn(EBool(false)).setId(18655))
  val instToStepMap: Map[Int, Int] = Map(18656 -> 0, 18655 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(18656, 18655))
  /* Beautified form:
  "UpdateExpression1IsFunctionDefinition0" (this, LeftHandSideExpression) => return false
  */
}
