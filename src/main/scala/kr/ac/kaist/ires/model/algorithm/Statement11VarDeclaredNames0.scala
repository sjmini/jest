package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement11VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""Statement11VarDeclaredNames0""", List(Id("""this"""), Id("""ThrowStatement""")), None, IReturn(EList(List())).setId(25854))
  val instToStepMap: Map[Int, Int] = Map(25854 -> 0, 25855 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25854, 25855))
  /* Beautified form:
  "Statement11VarDeclaredNames0" (this, ThrowStatement) => return (new [])
  */
}
