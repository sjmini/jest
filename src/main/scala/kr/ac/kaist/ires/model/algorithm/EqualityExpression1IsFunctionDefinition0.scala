package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EqualityExpression1IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""EqualityExpression1IsFunctionDefinition0""", List(Id("""this"""), Id("""EqualityExpression"""), Id("""RelationalExpression""")), None, IReturn(EBool(false)).setId(21521))
  val instToStepMap: Map[Int, Int] = Map(21521 -> 0, 21522 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(21521, 21522))
  /* Beautified form:
  "EqualityExpression1IsFunctionDefinition0" (this, EqualityExpression, RelationalExpression) => return false
  */
}
