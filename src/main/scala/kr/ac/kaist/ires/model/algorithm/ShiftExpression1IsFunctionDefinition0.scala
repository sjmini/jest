package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ShiftExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""ShiftExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""ShiftExpression"""), Id("""AdditiveExpression""")), None, IReturn(EBool(false)).setId(20318))
  val instToStepMap: Map[Int, Int] = Map(20318 -> 0, 20319 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(20319, 20318))
  /* Beautified form:
  "ShiftExpression1IsFunctionDefinition0" (this, ShiftExpression, AdditiveExpression) => return false
  */
}
