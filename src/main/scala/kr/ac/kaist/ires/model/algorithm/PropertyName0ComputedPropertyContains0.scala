package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PropertyName0ComputedPropertyContains0 {
  val length: Int = 0
  val func: Func = Func("""PropertyName0ComputedPropertyContains0""", List(Id("""this"""), Id("""LiteralPropertyName"""), Id("""symbol""")), None, IReturn(EBool(false)).setId(14386))
  val instToStepMap: Map[Int, Int] = Map(14386 -> 0, 14387 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14387, 14386))
  /* Beautified form:
  "PropertyName0ComputedPropertyContains0" (this, LiteralPropertyName, symbol) => return false
  */
}
