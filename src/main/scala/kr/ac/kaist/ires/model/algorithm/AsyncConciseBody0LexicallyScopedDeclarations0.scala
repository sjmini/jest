package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncConciseBody0LexicallyScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""AsyncConciseBody0LexicallyScopedDeclarations0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, IReturn(EList(List())).setId(44263))
  val instToStepMap: Map[Int, Int] = Map(44263 -> 0, 44264 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44263, 44264))
  /* Beautified form:
  "AsyncConciseBody0LexicallyScopedDeclarations0" (this, AssignmentExpression) => return (new [])
  */
}
