package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression3AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression3AssignmentTargetType0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""TemplateLiteral""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(16509))
  val instToStepMap: Map[Int, Int] = Map(16509 -> 0, 16510 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16509, 16510))
  /* Beautified form:
  "MemberExpression3AssignmentTargetType0" (this, MemberExpression, TemplateLiteral) => return CONST_invalid
  */
}
