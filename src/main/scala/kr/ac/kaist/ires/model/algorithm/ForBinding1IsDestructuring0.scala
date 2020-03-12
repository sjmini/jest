package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ForBinding1IsDestructuring0 {
  val length: Int = 0
  val func: Func = Func("""ForBinding1IsDestructuring0""", List(Id("""this"""), Id("""BindingPattern""")), None, IReturn(EBool(true)).setId(32154))
  val instToStepMap: Map[Int, Int] = Map(32154 -> 0, 32155 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32155, 32154))
  /* Beautified form:
  "ForBinding1IsDestructuring0" (this, BindingPattern) => return true
  */
}
