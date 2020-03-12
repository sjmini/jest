package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression11AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression11AssignmentTargetType0""", List(Id("""this"""), Id("""TemplateLiteral""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(13649))
  val instToStepMap: Map[Int, Int] = Map(13649 -> 0, 13650 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13650, 13649))
  /* Beautified form:
  "PrimaryExpression11AssignmentTargetType0" (this, TemplateLiteral) => return CONST_invalid
  */
}
