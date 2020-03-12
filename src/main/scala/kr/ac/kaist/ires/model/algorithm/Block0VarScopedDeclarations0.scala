package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Block0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""Block0VarScopedDeclarations0""", List(Id("""this""")), None, IReturn(EList(List())).setId(26801))
  val instToStepMap: Map[Int, Int] = Map(26801 -> 0, 26802 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26802, 26801))
  /* Beautified form:
  "Block0VarScopedDeclarations0" (this) => return (new [])
  */
}
