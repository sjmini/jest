package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression8IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression8IsFunctionDefinition0""", List(Id("""this"""), Id("""AwaitExpression""")), None, IReturn(EBool(false)).setId(19058))
  val instToStepMap: Map[Int, Int] = Map(19058 -> 0, 19059 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19059, 19058))
  /* Beautified form:
  "UnaryExpression8IsFunctionDefinition0" (this, AwaitExpression) => return false
  */
}
