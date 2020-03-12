package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingElement1BoundNames1 {
  val length: Int = 0
  val func: Func = Func("""BindingElement1BoundNames1""", List(Id("""this"""), Id("""BindingPattern"""), Id("""Initializer""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingPattern"""))), EStr("""BoundNames""")).setId(27967), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27968))).setId(27973))
  val instToStepMap: Map[Int, Int] = Map(27968 -> 0, 27969 -> 0, 27967 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27969, 27968, 27967))
  /* Beautified form:
  "BindingElement1BoundNames1" (this, BindingPattern, Initializer) => {
    access __x0__ = (BindingPattern "BoundNames")
    return __x0__
  }
  */
}
