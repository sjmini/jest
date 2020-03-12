package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseBlock0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock0VarScopedDeclarations0""", List(Id("""this""")), None, IReturn(EList(List())).setId(35280))
  val instToStepMap: Map[Int, Int] = Map(35280 -> 0, 35281 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(35281, 35280))
  /* Beautified form:
  "CaseBlock0VarScopedDeclarations0" (this) => return (new [])
  */
}
