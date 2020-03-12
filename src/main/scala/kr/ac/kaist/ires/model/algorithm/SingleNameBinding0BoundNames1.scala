package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SingleNameBinding0BoundNames1 {
  val length: Int = 0
  val func: Func = Func("""SingleNameBinding0BoundNames1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""Initializer""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BoundNames""")).setId(27957), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27958))).setId(27963))
  val instToStepMap: Map[Int, Int] = Map(27957 -> 0, 27958 -> 0, 27959 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27958, 27957, 27959))
  /* Beautified form:
  "SingleNameBinding0BoundNames1" (this, BindingIdentifier, Initializer) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }
  */
}
