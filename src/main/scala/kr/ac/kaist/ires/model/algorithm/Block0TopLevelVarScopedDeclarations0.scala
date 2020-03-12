package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Block0TopLevelVarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""Block0TopLevelVarScopedDeclarations0""", List(Id("""this""")), None, IReturn(EList(List())).setId(26646))
  val instToStepMap: Map[Int, Int] = Map(26646 -> 0, 26647 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26646, 26647))
  /* Beautified form:
  "Block0TopLevelVarScopedDeclarations0" (this) => return (new [])
  */
}
