package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement6VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""Statement6VarDeclaredNames0""", List(Id("""this"""), Id("""ContinueStatement""")), None, IReturn(EList(List())).setId(25839))
  val instToStepMap: Map[Int, Int] = Map(25840 -> 0, 25839 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25839, 25840))
  /* Beautified form:
  "Statement6VarDeclaredNames0" (this, ContinueStatement) => return (new [])
  */
}
