package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ConciseBody0LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""ConciseBody0LexicallyDeclaredNames0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, IReturn(EList(List())).setId(38825))
  val instToStepMap: Map[Int, Int] = Map(38825 -> 0, 38826 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38825, 38826))
  /* Beautified form:
  "ConciseBody0LexicallyDeclaredNames0" (this, AssignmentExpression) => return (new [])
  */
}
