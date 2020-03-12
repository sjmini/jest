package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingElement1ContainsExpression1 {
  val length: Int = 0
  val func: Func = Func("""BindingElement1ContainsExpression1""", List(Id("""this"""), Id("""BindingPattern"""), Id("""Initializer""")), None, IReturn(EBool(true)).setId(28129))
  val instToStepMap: Map[Int, Int] = Map(28129 -> 0, 28130 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28129, 28130))
  /* Beautified form:
  "BindingElement1ContainsExpression1" (this, BindingPattern, Initializer) => return true
  */
}
