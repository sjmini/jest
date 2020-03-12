package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayBindingPattern0ContainsExpression2 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern0ContainsExpression2""", List(Id("""this"""), Id("""Elision""")), None, IReturn(EBool(false)).setId(27982))
  val instToStepMap: Map[Int, Int] = Map(27982 -> 0, 27983 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27983, 27982))
  /* Beautified form:
  "ArrayBindingPattern0ContainsExpression2" (this, Elision) => return false
  */
}
