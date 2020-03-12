package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement1ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""Statement1ContainsDuplicateLabels0""", List(Id("""this"""), Id("""VariableStatement"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(25647))
  val instToStepMap: Map[Int, Int] = Map(25648 -> 0, 25647 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25647, 25648))
  /* Beautified form:
  "Statement1ContainsDuplicateLabels0" (this, VariableStatement, labelSet) => return false
  */
}
