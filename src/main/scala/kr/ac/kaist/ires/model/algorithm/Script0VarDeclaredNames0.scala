package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Script0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""Script0VarDeclaredNames0""", List(), None, IReturn(EList(List())).setId(47084))
  val instToStepMap: Map[Int, Int] = Map(47084 -> 0, 47085 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(47084, 47085))
  /* Beautified form:
  "Script0VarDeclaredNames0" () => return (new [])
  */
}
