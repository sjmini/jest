package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ConciseBody0ContainsUseStrict0 {
  val length: Int = 0
  val func: Func = Func("""ConciseBody0ContainsUseStrict0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, IReturn(EBool(false)).setId(38748))
  val instToStepMap: Map[Int, Int] = Map(38748 -> 0, 38749 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38748, 38749))
  /* Beautified form:
  "ConciseBody0ContainsUseStrict0" (this, AssignmentExpression) => return false
  */
}
