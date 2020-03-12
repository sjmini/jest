package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression2IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression2IsFunctionDefinition0""", List(Id("""this"""), Id("""UnaryExpression""")), None, IReturn(EBool(false)).setId(19028))
  val instToStepMap: Map[Int, Int] = Map(19028 -> 0, 19029 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19029, 19028))
  /* Beautified form:
  "UnaryExpression2IsFunctionDefinition0" (this, UnaryExpression) => return false
  */
}
