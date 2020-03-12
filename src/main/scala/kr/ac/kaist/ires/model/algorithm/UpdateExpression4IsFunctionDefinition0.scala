package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UpdateExpression4IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""UpdateExpression4IsFunctionDefinition0""", List(Id("""this"""), Id("""UnaryExpression""")), None, IReturn(EBool(false)).setId(18670))
  val instToStepMap: Map[Int, Int] = Map(18670 -> 0, 18671 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(18671, 18670))
  /* Beautified form:
  "UpdateExpression4IsFunctionDefinition0" (this, UnaryExpression) => return false
  */
}
