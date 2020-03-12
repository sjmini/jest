package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BreakStatement0ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""BreakStatement0ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(33974))
  val instToStepMap: Map[Int, Int] = Map(33974 -> 0, 33975 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(33975, 33974))
  /* Beautified form:
  "BreakStatement0ContainsUndefinedBreakTarget0" (this, labelSet) => return false
  */
}
