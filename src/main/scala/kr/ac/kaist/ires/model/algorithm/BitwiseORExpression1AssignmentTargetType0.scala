package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BitwiseORExpression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""BitwiseORExpression1AssignmentTargetType0""", List(Id("""this"""), Id("""BitwiseORExpression"""), Id("""BitwiseXORExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(21934))
  val instToStepMap: Map[Int, Int] = Map(21934 -> 0, 21935 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(21935, 21934))
  /* Beautified form:
  "BitwiseORExpression1AssignmentTargetType0" (this, BitwiseORExpression, BitwiseXORExpression) => return CONST_invalid
  */
}
