package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledItem1ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""LabelledItem1ContainsDuplicateLabels0""", List(Id("""this"""), Id("""FunctionDeclaration"""), Id("""labelSet""")), None, IReturn(EBool(false)).setId(36183))
  val instToStepMap: Map[Int, Int] = Map(36183 -> 0, 36184 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36184, 36183))
  /* Beautified form:
  "LabelledItem1ContainsDuplicateLabels0" (this, FunctionDeclaration, labelSet) => return false
  */
}
