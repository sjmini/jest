package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Expression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""Expression1IsFunctionDefinition0""", List(Id("""this"""), Id("""Expression"""), Id("""AssignmentExpression""")), None, IReturn(EBool(false)).setId(25572))
  val instToStepMap: Map[Int, Int] = Map(25572 -> 0, 25573 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25572, 25573))
  /* Beautified form:
  "Expression1IsFunctionDefinition0" (this, Expression, AssignmentExpression) => return false
  */
}
