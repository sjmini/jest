package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SingleNameBinding0HasInitializer1 {
  val length: Int = 0
  val func: Func = Func("""SingleNameBinding0HasInitializer1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""Initializer""")), None, IReturn(EBool(true)).setId(28174))
  val instToStepMap: Map[Int, Int] = Map(28174 -> 0, 28175 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28175, 28174))
  /* Beautified form:
  "SingleNameBinding0HasInitializer1" (this, BindingIdentifier, Initializer) => return true
  */
}
