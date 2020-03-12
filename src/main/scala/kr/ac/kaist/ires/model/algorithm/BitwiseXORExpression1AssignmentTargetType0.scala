package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BitwiseXORExpression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""BitwiseXORExpression1AssignmentTargetType0""", List(Id("""this"""), Id("""BitwiseXORExpression"""), Id("""BitwiseANDExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(21929))
  val instToStepMap: Map[Int, Int] = Map(21929 -> 0, 21930 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(21929, 21930))
  /* Beautified form:
  "BitwiseXORExpression1AssignmentTargetType0" (this, BitwiseXORExpression, BitwiseANDExpression) => return CONST_invalid
  */
}
