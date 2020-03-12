package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Statement6VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""Statement6VarScopedDeclarations0""", List(Id("""this"""), Id("""ContinueStatement""")), None, IReturn(EList(List())).setId(25874))
  val instToStepMap: Map[Int, Int] = Map(25874 -> 0, 25875 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25875, 25874))
  /* Beautified form:
  "Statement6VarScopedDeclarations0" (this, ContinueStatement) => return (new [])
  */
}
