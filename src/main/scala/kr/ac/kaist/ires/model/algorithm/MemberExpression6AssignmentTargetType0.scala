package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression6AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression6AssignmentTargetType0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Arguments""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(16514))
  val instToStepMap: Map[Int, Int] = Map(16514 -> 0, 16515 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16515, 16514))
  /* Beautified form:
  "MemberExpression6AssignmentTargetType0" (this, MemberExpression, Arguments) => return CONST_invalid
  */
}
