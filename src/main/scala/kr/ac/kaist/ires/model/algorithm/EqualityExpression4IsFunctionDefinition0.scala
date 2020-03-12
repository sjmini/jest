package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EqualityExpression4IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""EqualityExpression4IsFunctionDefinition0""", List(Id("""this"""), Id("""EqualityExpression"""), Id("""RelationalExpression""")), None, IReturn(EBool(false)).setId(21536))
  val instToStepMap: Map[Int, Int] = Map(21536 -> 0, 21537 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(21536, 21537))
  /* Beautified form:
  "EqualityExpression4IsFunctionDefinition0" (this, EqualityExpression, RelationalExpression) => return false
  */
}
