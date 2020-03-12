package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BitwiseORExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""BitwiseORExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""BitwiseORExpression"""), Id("""BitwiseXORExpression""")), None, IReturn(EBool(false)).setId(21919))
  val instToStepMap: Map[Int, Int] = Map(21920 -> 0, 21919 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(21920, 21919))
  /* Beautified form:
  "BitwiseORExpression1IsFunctionDefinition0" (this, BitwiseORExpression, BitwiseXORExpression) => return false
  */
}
