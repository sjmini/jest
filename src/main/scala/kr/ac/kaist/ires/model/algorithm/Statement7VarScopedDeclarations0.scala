package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement7VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""Statement7VarScopedDeclarations0""", List(Id("""this"""), Id("""BreakStatement""")), None, IReturn(EList(List())).setId(25879))
  val instToStepMap: Map[Int, Int] = Map(25879 -> 0, 25880 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25880, 25879))
  /* Beautified form:
  "Statement7VarScopedDeclarations0" (this, BreakStatement) => return (new [])
  */
}
