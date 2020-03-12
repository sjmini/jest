package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object NewExpression1IsDestructuring0 {
  val length: Int = 0
  val func: Func = Func("""NewExpression1IsDestructuring0""", List(Id("""this"""), Id("""NewExpression""")), None, IReturn(EBool(false)).setId(16404))
  val instToStepMap: Map[Int, Int] = Map(16404 -> 0, 16405 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16405, 16404))
  /* Beautified form:
  "NewExpression1IsDestructuring0" (this, NewExpression) => return false
  */
}
