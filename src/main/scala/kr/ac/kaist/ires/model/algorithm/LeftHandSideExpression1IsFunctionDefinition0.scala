package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LeftHandSideExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""LeftHandSideExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""CallExpression""")), None, IReturn(EBool(false)).setId(16351))
  val instToStepMap: Map[Int, Int] = Map(16352 -> 0, 16351 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16351, 16352))
  /* Beautified form:
  "LeftHandSideExpression1IsFunctionDefinition0" (this, CallExpression) => return false
  */
}
