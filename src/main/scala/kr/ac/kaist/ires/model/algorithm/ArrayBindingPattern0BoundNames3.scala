package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayBindingPattern0BoundNames3 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern0BoundNames3""", List(Id("""this"""), Id("""Elision"""), Id("""BindingRestElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingRestElement"""))), EStr("""BoundNames""")).setId(27787), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27788))).setId(27793))
  val instToStepMap: Map[Int, Int] = Map(27787 -> 0, 27788 -> 0, 27789 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27789, 27787, 27788))
  /* Beautified form:
  "ArrayBindingPattern0BoundNames3" (this, Elision, BindingRestElement) => {
    access __x0__ = (BindingRestElement "BoundNames")
    return __x0__
  }
  */
}
