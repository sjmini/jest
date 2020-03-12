package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayBindingPattern2BoundNames2 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern2BoundNames2""", List(Id("""this"""), Id("""BindingElementList"""), Id("""Elision""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElementList"""))), EStr("""BoundNames""")).setId(27807), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27808))).setId(27813))
  val instToStepMap: Map[Int, Int] = Map(27808 -> 0, 27809 -> 0, 27807 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27808, 27809, 27807))
  /* Beautified form:
  "ArrayBindingPattern2BoundNames2" (this, BindingElementList, Elision) => {
    access __x0__ = (BindingElementList "BoundNames")
    return __x0__
  }
  */
}
