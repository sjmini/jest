package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AdditiveExpression2AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""AdditiveExpression2AssignmentTargetType0""", List(Id("""this"""), Id("""AdditiveExpression"""), Id("""MultiplicativeExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(19969))
  val instToStepMap: Map[Int, Int] = Map(19969 -> 0, 19970 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19969, 19970))
  /* Beautified form:
  "AdditiveExpression2AssignmentTargetType0" (this, AdditiveExpression, MultiplicativeExpression) => return CONST_invalid
  */
}
