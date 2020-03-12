package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ConciseBody0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""ConciseBody0VarScopedDeclarations0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, IReturn(EList(List())).setId(38840))
  val instToStepMap: Map[Int, Int] = Map(38840 -> 0, 38841 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38840, 38841))
  /* Beautified form:
  "ConciseBody0VarScopedDeclarations0" (this, AssignmentExpression) => return (new [])
  */
}
