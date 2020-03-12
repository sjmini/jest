package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LexicalBinding0BoundNames1 {
  val length: Int = 0
  val func: Func = Func("""LexicalBinding0BoundNames1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""Initializer""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BoundNames""")).setId(27157), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27158))).setId(27163))
  val instToStepMap: Map[Int, Int] = Map(27157 -> 0, 27158 -> 0, 27159 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27158, 27157, 27159))
  /* Beautified form:
  "LexicalBinding0BoundNames1" (this, BindingIdentifier, Initializer) => {
    access __x0__ = (BindingIdentifier "BoundNames")
    return __x0__
  }
  */
}
