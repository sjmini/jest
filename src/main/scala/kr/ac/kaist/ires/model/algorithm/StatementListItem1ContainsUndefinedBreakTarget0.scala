package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementListItem1ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""Declaration"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(26193))
  val instToStepMap: Map[Int, Int] = Map(26193 -> 0, 26194 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26194, 26193))
  /* Beautified form:
  "StatementListItem1ContainsUndefinedBreakTarget0" (this, Declaration, labelSet) => return false
  */
}
