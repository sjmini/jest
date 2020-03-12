package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement6ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""Statement6ContainsDuplicateLabels0""", List(Id("""this"""), Id("""ContinueStatement"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25662))
  val instToStepMap: Map[Int, Int] = Map(25662 -> 0, 25663 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25663, 25662))
  /* Beautified form:
  "Statement6ContainsDuplicateLabels0" (this, ContinueStatement, labelSet) => return false
  */
}
