package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ConciseBody0VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""ConciseBody0VarDeclaredNames0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, IReturn(EList(List())).setId(38835))
  val instToStepMap: Map[Int, Int] = Map(38835 -> 0, 38836 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38835, 38836))
  /* Beautified form:
  "ConciseBody0VarDeclaredNames0" (this, AssignmentExpression) => return (new [])
  */
}
