package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression4IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression4IsFunctionDefinition0""", List(Id("""this"""), Id("""UnaryExpression""")), None, IReturn(EBool(false)).setId(19038))
  val instToStepMap: Map[Int, Int] = Map(19038 -> 0, 19039 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19038, 19039))
  /* Beautified form:
  "UnaryExpression4IsFunctionDefinition0" (this, UnaryExpression) => return false
  */
}
