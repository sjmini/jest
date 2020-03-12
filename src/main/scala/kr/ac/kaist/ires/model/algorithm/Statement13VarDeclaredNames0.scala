package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement13VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""Statement13VarDeclaredNames0""", List(Id("""this"""), Id("""DebuggerStatement""")), None, IReturn(EList(List())).setId(25859))
  val instToStepMap: Map[Int, Int] = Map(25859 -> 0, 25860 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25859, 25860))
  /* Beautified form:
  "Statement13VarDeclaredNames0" (this, DebuggerStatement) => return (new [])
  */
}
