package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncConciseBody0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""AsyncConciseBody0VarScopedDeclarations0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, IReturn(EList(List())).setId(44273))
  val instToStepMap: Map[Int, Int] = Map(44273 -> 0, 44274 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44273, 44274))
  /* Beautified form:
  "AsyncConciseBody0VarScopedDeclarations0" (this, AssignmentExpression) => return (new [])
  */
}
