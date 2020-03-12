package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PropertyName1ComputedPropertyContains0 {
  val length: Int = 0
  val func: Func = Func("""PropertyName1ComputedPropertyContains0""", List(Id("""this"""), Id("""ComputedPropertyName"""), Id("""symbol""")), None, IExpr(ENotSupported("""Etc""")).setId(14391))
  val instToStepMap: Map[Int, Int] = Map(14391 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14391))
  /* Beautified form:
  "PropertyName1ComputedPropertyContains0" (this, ComputedPropertyName, symbol) => !!! "Etc"
  */
}
