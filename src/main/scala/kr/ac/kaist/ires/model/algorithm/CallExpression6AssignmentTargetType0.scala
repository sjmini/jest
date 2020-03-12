package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CallExpression6AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression6AssignmentTargetType0""", List(Id("""this"""), Id("""CallExpression"""), Id("""TemplateLiteral""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(16499))
  val instToStepMap: Map[Int, Int] = Map(16499 -> 0, 16500 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16500, 16499))
  /* Beautified form:
  "CallExpression6AssignmentTargetType0" (this, CallExpression, TemplateLiteral) => return CONST_invalid
  */
}
