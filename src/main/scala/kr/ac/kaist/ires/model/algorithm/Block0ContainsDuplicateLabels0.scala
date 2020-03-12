package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Block0ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""Block0ContainsDuplicateLabels0""", List(Id("""this"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(26110))
  val instToStepMap: Map[Int, Int] = Map(26110 -> 0, 26111 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26111, 26110))
  /* Beautified form:
  "Block0ContainsDuplicateLabels0" (this, labelSet) => return false
  */
}
