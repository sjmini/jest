package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncConciseBody0LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""AsyncConciseBody0LexicallyDeclaredNames0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, IReturn(EList(List())).setId(44258))
  val instToStepMap: Map[Int, Int] = Map(44258 -> 0, 44259 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44259, 44258))
  /* Beautified form:
  "AsyncConciseBody0LexicallyDeclaredNames0" (this, AssignmentExpression) => return (new [])
  */
}
