package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassElement2ComputedPropertyContains0 {
  val length: Int = 0
  val func: Func = Func("""ClassElement2ComputedPropertyContains0""", List(Id("""this"""), Id("""symbol""")), None, IReturn(EBool(false)).setId(42449))
  val instToStepMap: Map[Int, Int] = Map(42449 -> 0, 42450 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(42449, 42450))
  /* Beautified form:
  "ClassElement2ComputedPropertyContains0" (this, symbol) => return false
  */
}
