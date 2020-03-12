package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LeftHandSideExpression1IsDestructuring0 {
  val length: Int = 0
  val func: Func = Func("""LeftHandSideExpression1IsDestructuring0""", List(Id("""this"""), Id("""CallExpression""")), None, IReturn(EBool(false)).setId(16409))
  val instToStepMap: Map[Int, Int] = Map(16409 -> 0, 16410 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16409, 16410))
  /* Beautified form:
  "LeftHandSideExpression1IsDestructuring0" (this, CallExpression) => return false
  */
}
