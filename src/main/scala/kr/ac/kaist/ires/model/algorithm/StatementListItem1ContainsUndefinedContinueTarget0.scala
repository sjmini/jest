package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementListItem1ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""StatementListItem1ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""Declaration"""), Id("""iterationSet"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(26237))
  val instToStepMap: Map[Int, Int] = Map(26237 -> 0, 26238 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26237, 26238))
  /* Beautified form:
  "StatementListItem1ContainsUndefinedContinueTarget0" (this, Declaration, iterationSet, labelSet) => return false
  */
}
