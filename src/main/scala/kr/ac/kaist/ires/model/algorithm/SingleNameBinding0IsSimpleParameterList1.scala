package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SingleNameBinding0IsSimpleParameterList1 {
  val length: Int = 0
  val func: Func = Func("""SingleNameBinding0IsSimpleParameterList1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""Initializer""")), None, IReturn(EBool(false)).setId(28194))
  val instToStepMap: Map[Int, Int] = Map(28194 -> 0, 28195 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28194, 28195))
  /* Beautified form:
  "SingleNameBinding0IsSimpleParameterList1" (this, BindingIdentifier, Initializer) => return false
  */
}
