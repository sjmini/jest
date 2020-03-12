package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ComputedPropertyName0PropName0 {
  val length: Int = 0
  val func: Func = Func("""ComputedPropertyName0PropName0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, IReturn(ERef(RefId(Id("""CONST_empty""")))).setId(14537))
  val instToStepMap: Map[Int, Int] = Map(14537 -> 0, 14538 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(14538, 14537))
  /* Beautified form:
  "ComputedPropertyName0PropName0" (this, AssignmentExpression) => return CONST_empty
  */
}
