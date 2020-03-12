package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PropertyName1IsComputedPropertyKey0 {
  val length: Int = 0
  val func: Func = Func("""PropertyName1IsComputedPropertyKey0""", List(Id("""this"""), Id("""ComputedPropertyName""")), None, IReturn(EBool(true)).setId(14455))
  val instToStepMap: Map[Int, Int] = Map(14455 -> 0, 14456 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14455, 14456))
  /* Beautified form:
  "PropertyName1IsComputedPropertyKey0" (this, ComputedPropertyName) => return true
  */
}
