package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object VariableDeclaration1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""VariableDeclaration1BoundNames0""", List(Id("""this"""), Id("""BindingPattern"""), Id("""Initializer""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingPattern"""))), EStr("""BoundNames""")).setId(27481), IReturn(ERef(RefId(Id("""__x0__""")))).setId(27482))).setId(27487))
  val instToStepMap: Map[Int, Int] = Map(27481 -> 0, 27482 -> 0, 27483 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27483, 27482, 27481))
  /* Beautified form:
  "VariableDeclaration1BoundNames0" (this, BindingPattern, Initializer) => {
    access __x0__ = (BindingPattern "BoundNames")
    return __x0__
  }
  */
}
