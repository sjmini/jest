package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression5AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression5AssignmentTargetType0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(20743))
  val instToStepMap: Map[Int, Int] = Map(20743 -> 0, 20744 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(20743, 20744))
  /* Beautified form:
  "RelationalExpression5AssignmentTargetType0" (this, RelationalExpression, ShiftExpression) => return CONST_invalid
  */
}
