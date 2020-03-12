package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement7VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""Statement7VarDeclaredNames0""", List(Id("""this"""), Id("""BreakStatement""")), None, IReturn(EList(List())).setId(25844))
  val instToStepMap: Map[Int, Int] = Map(25844 -> 0, 25845 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25845, 25844))
  /* Beautified form:
  "Statement7VarDeclaredNames0" (this, BreakStatement) => return (new [])
  */
}
