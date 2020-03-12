package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ShiftExpression3IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""ShiftExpression3IsFunctionDefinition0""", List(Id("""this"""), Id("""ShiftExpression"""), Id("""AdditiveExpression""")), None, IReturn(EBool(false)).setId(20328))
  val instToStepMap: Map[Int, Int] = Map(20328 -> 0, 20329 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(20328, 20329))
  /* Beautified form:
  "ShiftExpression3IsFunctionDefinition0" (this, ShiftExpression, AdditiveExpression) => return false
  */
}
