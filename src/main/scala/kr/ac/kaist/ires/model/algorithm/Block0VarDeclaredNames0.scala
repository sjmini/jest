package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Block0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""Block0VarDeclaredNames0""", List(Id("""this""")), None, IReturn(EList(List())).setId(26751))
  val instToStepMap: Map[Int, Int] = Map(26752 -> 0, 26751 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26751, 26752))
  /* Beautified form:
  "Block0VarDeclaredNames0" (this) => return (new [])
  */
}
