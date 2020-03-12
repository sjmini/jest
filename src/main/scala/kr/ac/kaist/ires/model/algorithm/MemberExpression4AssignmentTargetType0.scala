package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression4AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression4AssignmentTargetType0""", List(Id("""this"""), Id("""SuperProperty""")), None, IReturn(ERef(RefId(Id("""CONST_simple""")))).setId(16474))
  val instToStepMap: Map[Int, Int] = Map(16474 -> 0, 16475 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16474, 16475))
  /* Beautified form:
  "MemberExpression4AssignmentTargetType0" (this, SuperProperty) => return CONST_simple
  */
}
