package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingElisionElement0BoundNames1 {
  val length: Int = 0
  val func: Func = Func("""BindingElisionElement0BoundNames1""", List(Id("""this"""), Id("""Elision"""), Id("""BindingElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElement"""))), EStr("""BoundNames""")).setId(27937), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27938))).setId(27943))
  val instToStepMap: Map[Int, Int] = Map(27937 -> 0, 27938 -> 0, 27939 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27938, 27937, 27939))
  /* Beautified form:
  "BindingElisionElement0BoundNames1" (this, Elision, BindingElement) => {
    access __x0__ = (BindingElement "BoundNames")
    return __x0__
  }
  */
}
