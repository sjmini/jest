package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BitwiseXORExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""BitwiseXORExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""BitwiseXORExpression"""), Id("""BitwiseANDExpression""")), None, IReturn(EBool(false)).setId(21914))
  val instToStepMap: Map[Int, Int] = Map(21914 -> 0, 21915 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(21915, 21914))
  /* Beautified form:
  "BitwiseXORExpression1IsFunctionDefinition0" (this, BitwiseXORExpression, BitwiseANDExpression) => return false
  */
}
