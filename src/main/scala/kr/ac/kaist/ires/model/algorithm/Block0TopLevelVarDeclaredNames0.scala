package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Block0TopLevelVarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""Block0TopLevelVarDeclaredNames0""", List(Id("""this""")), None, IReturn(EList(List())).setId(26545))
  val instToStepMap: Map[Int, Int] = Map(26545 -> 0, 26546 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26545, 26546))
  /* Beautified form:
  "Block0TopLevelVarDeclaredNames0" (this) => return (new [])
  */
}
