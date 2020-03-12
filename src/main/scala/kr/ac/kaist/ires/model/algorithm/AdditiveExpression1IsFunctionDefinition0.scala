package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AdditiveExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""AdditiveExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""AdditiveExpression"""), Id("""MultiplicativeExpression""")), None, IReturn(EBool(false)).setId(19954))
  val instToStepMap: Map[Int, Int] = Map(19954 -> 0, 19955 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19955, 19954))
  /* Beautified form:
  "AdditiveExpression1IsFunctionDefinition0" (this, AdditiveExpression, MultiplicativeExpression) => return false
  */
}
