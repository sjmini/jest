package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression2AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression2AssignmentTargetType0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""IdentifierName""")), None, IReturn(ERef(RefId(Id("""CONST_simple""")))).setId(16469))
  val instToStepMap: Map[Int, Int] = Map(16469 -> 0, 16470 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16469, 16470))
  /* Beautified form:
  "MemberExpression2AssignmentTargetType0" (this, MemberExpression, IdentifierName) => return CONST_simple
  */
}
