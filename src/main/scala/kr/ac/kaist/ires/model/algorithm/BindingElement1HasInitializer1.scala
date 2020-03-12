package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingElement1HasInitializer1 {
  val length: Int = 0
  val func: Func = Func("""BindingElement1HasInitializer1""", List(Id("""this"""), Id("""BindingPattern"""), Id("""Initializer""")), None, IReturn(EBool(true)).setId(28164))
  val instToStepMap: Map[Int, Int] = Map(28164 -> 0, 28165 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28164, 28165))
  /* Beautified form:
  "BindingElement1HasInitializer1" (this, BindingPattern, Initializer) => return true
  */
}
