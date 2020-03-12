package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression3AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression3AssignmentTargetType0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(20733))
  val instToStepMap: Map[Int, Int] = Map(20733 -> 0, 20734 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(20733, 20734))
  /* Beautified form:
  "RelationalExpression3AssignmentTargetType0" (this, RelationalExpression, ShiftExpression) => return CONST_invalid
  */
}
