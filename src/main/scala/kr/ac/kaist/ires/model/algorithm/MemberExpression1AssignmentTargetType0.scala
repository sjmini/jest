package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression1AssignmentTargetType0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Expression""")), None, IReturn(ERef(RefId(Id("""CONST_simple""")))).setId(16464))
  val instToStepMap: Map[Int, Int] = Map(16464 -> 0, 16465 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16465, 16464))
  /* Beautified form:
  "MemberExpression1AssignmentTargetType0" (this, MemberExpression, Expression) => return CONST_simple
  */
}
