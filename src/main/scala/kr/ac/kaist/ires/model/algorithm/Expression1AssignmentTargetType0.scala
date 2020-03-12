package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Expression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""Expression1AssignmentTargetType0""", List(Id("""this"""), Id("""Expression"""), Id("""AssignmentExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(25577))
  val instToStepMap: Map[Int, Int] = Map(25577 -> 0, 25578 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(25577, 25578))
  /* Beautified form:
  "Expression1AssignmentTargetType0" (this, Expression, AssignmentExpression) => return CONST_invalid
  */
}
