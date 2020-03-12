package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PropertyName0IsComputedPropertyKey0 {
  val length: Int = 0
  val func: Func = Func("""PropertyName0IsComputedPropertyKey0""", List(Id("""this"""), Id("""LiteralPropertyName""")), None, IReturn(EBool(false)).setId(14450))
  val instToStepMap: Map[Int, Int] = Map(14450 -> 0, 14451 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14451, 14450))
  /* Beautified form:
  "PropertyName0IsComputedPropertyKey0" (this, LiteralPropertyName) => return false
  */
}
