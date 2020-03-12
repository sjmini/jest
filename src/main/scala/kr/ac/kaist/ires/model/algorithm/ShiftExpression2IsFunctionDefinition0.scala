package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ShiftExpression2IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""ShiftExpression2IsFunctionDefinition0""", List(Id("""this"""), Id("""ShiftExpression"""), Id("""AdditiveExpression""")), None, IReturn(EBool(false)).setId(20323))
  val instToStepMap: Map[Int, Int] = Map(20323 -> 0, 20324 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(20323, 20324))
  /* Beautified form:
  "ShiftExpression2IsFunctionDefinition0" (this, ShiftExpression, AdditiveExpression) => return false
  */
}
