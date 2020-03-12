package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ConciseBody0LexicallyScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""ConciseBody0LexicallyScopedDeclarations0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, IReturn(EList(List())).setId(38830))
  val instToStepMap: Map[Int, Int] = Map(38830 -> 0, 38831 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38830, 38831))
  /* Beautified form:
  "ConciseBody0LexicallyScopedDeclarations0" (this, AssignmentExpression) => return (new [])
  */
}
