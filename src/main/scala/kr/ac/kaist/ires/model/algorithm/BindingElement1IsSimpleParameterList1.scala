package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingElement1IsSimpleParameterList1 {
  val length: Int = 0
  val func: Func = Func("""BindingElement1IsSimpleParameterList1""", List(Id("""this"""), Id("""BindingPattern"""), Id("""Initializer""")), None, IReturn(EBool(false)).setId(28184))
  val instToStepMap: Map[Int, Int] = Map(28184 -> 0, 28185 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28184, 28185))
  /* Beautified form:
  "BindingElement1IsSimpleParameterList1" (this, BindingPattern, Initializer) => return false
  */
}
