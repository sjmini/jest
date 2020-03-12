package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement7ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""Statement7ContainsDuplicateLabels0""", List(Id("""this"""), Id("""BreakStatement"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25667))
  val instToStepMap: Map[Int, Int] = Map(25667 -> 0, 25668 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25668, 25667))
  /* Beautified form:
  "Statement7ContainsDuplicateLabels0" (this, BreakStatement, labelSet) => return false
  */
}
