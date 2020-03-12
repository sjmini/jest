package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement11ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""Statement11ContainsDuplicateLabels0""", List(Id("""this"""), Id("""ThrowStatement"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25677))
  val instToStepMap: Map[Int, Int] = Map(25677 -> 0, 25678 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25677, 25678))
  /* Beautified form:
  "Statement11ContainsDuplicateLabels0" (this, ThrowStatement, labelSet) => return false
  */
}
