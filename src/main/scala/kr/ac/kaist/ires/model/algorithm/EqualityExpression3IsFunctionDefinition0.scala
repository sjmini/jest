package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EqualityExpression3IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""EqualityExpression3IsFunctionDefinition0""", List(Id("""this"""), Id("""EqualityExpression"""), Id("""RelationalExpression""")), None, IReturn(EBool(false)).setId(21531))
  val instToStepMap: Map[Int, Int] = Map(21531 -> 0, 21532 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(21532, 21531))
  /* Beautified form:
  "EqualityExpression3IsFunctionDefinition0" (this, EqualityExpression, RelationalExpression) => return false
  */
}
