package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BitwiseANDExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""BitwiseANDExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""BitwiseANDExpression"""), Id("""EqualityExpression""")), None, IReturn(EBool(false)).setId(21909))
  val instToStepMap: Map[Int, Int] = Map(21909 -> 0, 21910 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(21909, 21910))
  /* Beautified form:
  "BitwiseANDExpression1IsFunctionDefinition0" (this, BitwiseANDExpression, EqualityExpression) => return false
  */
}
