package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseBlock0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock0VarDeclaredNames0""", List(Id("""this""")), None, IReturn(EList(List())).setId(35119))
  val instToStepMap: Map[Int, Int] = Map(35120 -> 0, 35119 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(35119, 35120))
  /* Beautified form:
  "CaseBlock0VarDeclaredNames0" (this) => return (new [])
  */
}
