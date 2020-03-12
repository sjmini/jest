package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UpdateExpression2IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""UpdateExpression2IsFunctionDefinition0""", List(Id("""this"""), Id("""LeftHandSideExpression""")), None, IReturn(EBool(false)).setId(18660))
  val instToStepMap: Map[Int, Int] = Map(18660 -> 0, 18661 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(18661, 18660))
  /* Beautified form:
  "UpdateExpression2IsFunctionDefinition0" (this, LeftHandSideExpression) => return false
  */
}
