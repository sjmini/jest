package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SingleNameBinding0ContainsExpression1 {
  val length: Int = 0
  val func: Func = Func("""SingleNameBinding0ContainsExpression1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""Initializer""")), None, IReturn(EBool(true)).setId(28139))
  val instToStepMap: Map[Int, Int] = Map(28139 -> 0, 28140 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28140, 28139))
  /* Beautified form:
  "SingleNameBinding0ContainsExpression1" (this, BindingIdentifier, Initializer) => return true
  */
}
