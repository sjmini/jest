package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ExponentiationExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""ExponentiationExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""UpdateExpression"""), Id("""ExponentiationExpression""")), None, IReturn(EBool(false)).setId(19709))
  val instToStepMap: Map[Int, Int] = Map(19709 -> 0, 19710 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19710, 19709))
  /* Beautified form:
  "ExponentiationExpression1IsFunctionDefinition0" (this, UpdateExpression, ExponentiationExpression) => return false
  */
}
