package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EqualityExpression2IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""EqualityExpression2IsFunctionDefinition0""", List(Id("""this"""), Id("""EqualityExpression"""), Id("""RelationalExpression""")), None, IReturn(EBool(false)).setId(21526))
  val instToStepMap: Map[Int, Int] = Map(21526 -> 0, 21527 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(21526, 21527))
  /* Beautified form:
  "EqualityExpression2IsFunctionDefinition0" (this, EqualityExpression, RelationalExpression) => return false
  */
}
