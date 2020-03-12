package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AdditiveExpression2IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""AdditiveExpression2IsFunctionDefinition0""", List(Id("""this"""), Id("""AdditiveExpression"""), Id("""MultiplicativeExpression""")), None, IReturn(EBool(false)).setId(19959))
  val instToStepMap: Map[Int, Int] = Map(19959 -> 0, 19960 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19959, 19960))
  /* Beautified form:
  "AdditiveExpression2IsFunctionDefinition0" (this, AdditiveExpression, MultiplicativeExpression) => return false
  */
}
