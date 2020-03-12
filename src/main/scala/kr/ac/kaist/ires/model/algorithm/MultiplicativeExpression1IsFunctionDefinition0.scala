package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MultiplicativeExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""MultiplicativeExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""MultiplicativeExpression"""), Id("""MultiplicativeOperator"""), Id("""ExponentiationExpression""")), None, IReturn(EBool(false)).setId(19830))
  val instToStepMap: Map[Int, Int] = Map(19830 -> 0, 19831 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19831, 19830))
  /* Beautified form:
  "MultiplicativeExpression1IsFunctionDefinition0" (this, MultiplicativeExpression, MultiplicativeOperator, ExponentiationExpression) => return false
  */
}
