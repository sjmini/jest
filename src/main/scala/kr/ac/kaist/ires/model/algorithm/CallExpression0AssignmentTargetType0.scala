package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CallExpression0AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression0AssignmentTargetType0""", List(Id("""this"""), Id("""CoverCallExpressionAndAsyncArrowHead""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(16479))
  val instToStepMap: Map[Int, Int] = Map(16480 -> 0, 16479 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16480, 16479))
  /* Beautified form:
  "CallExpression0AssignmentTargetType0" (this, CoverCallExpressionAndAsyncArrowHead) => return CONST_invalid
  */
}
