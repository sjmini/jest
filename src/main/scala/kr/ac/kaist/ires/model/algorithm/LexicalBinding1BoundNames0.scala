package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LexicalBinding1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""LexicalBinding1BoundNames0""", List(Id("""this"""), Id("""BindingPattern"""), Id("""Initializer""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingPattern"""))), EStr("""BoundNames""")).setId(27167), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27168))).setId(27173))
  val instToStepMap: Map[Int, Int] = Map(27168 -> 0, 27169 -> 0, 27167 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27168, 27169, 27167))
  /* Beautified form:
  "LexicalBinding1BoundNames0" (this, BindingPattern, Initializer) => {
    access __x0__ = (BindingPattern "BoundNames")
    return __x0__
  }
  */
}
