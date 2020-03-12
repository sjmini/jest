package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement13VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""Statement13VarScopedDeclarations0""", List(Id("""this"""), Id("""DebuggerStatement""")), None, IReturn(EList(List())).setId(25894))
  val instToStepMap: Map[Int, Int] = Map(25894 -> 0, 25895 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25895, 25894))
  /* Beautified form:
  "Statement13VarScopedDeclarations0" (this, DebuggerStatement) => return (new [])
  */
}
