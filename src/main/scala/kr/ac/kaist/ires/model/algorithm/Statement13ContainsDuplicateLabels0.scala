package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement13ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""Statement13ContainsDuplicateLabels0""", List(Id("""this"""), Id("""DebuggerStatement"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25682))
  val instToStepMap: Map[Int, Int] = Map(25682 -> 0, 25683 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25682, 25683))
  /* Beautified form:
  "Statement13ContainsDuplicateLabels0" (this, DebuggerStatement, labelSet) => return false
  */
}
