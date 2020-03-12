package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement1ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""Statement1ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""VariableStatement"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25687))
  val instToStepMap: Map[Int, Int] = Map(25687 -> 0, 25688 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25688, 25687))
  /* Beautified form:
  "Statement1ContainsUndefinedBreakTarget0" (this, VariableStatement, labelSet) => return false
  */
}
