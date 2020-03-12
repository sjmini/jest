package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement13ContainsUndefinedBreakTarget0 {
  val length: Int = 0
  val func: Func = Func("""Statement13ContainsUndefinedBreakTarget0""", List(Id("""this"""), Id("""DebuggerStatement"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25717))
  val instToStepMap: Map[Int, Int] = Map(25717 -> 0, 25718 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25717, 25718))
  /* Beautified form:
  "Statement13ContainsUndefinedBreakTarget0" (this, DebuggerStatement, labelSet) => return false
  */
}
