package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Block0ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""Block0ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(26154))
  val instToStepMap: Map[Int, Int] = Map(26154 -> 0, 26155 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26155, 26154))
  /* Beautified form:
  "Block0ContainsUndefinedBreakTarget0" (this, labelSet) => return false
  */
}
