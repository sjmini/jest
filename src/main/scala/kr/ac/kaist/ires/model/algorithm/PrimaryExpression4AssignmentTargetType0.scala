package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression4AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression4AssignmentTargetType0""", List(Id("""this"""), Id("""ObjectLiteral""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(13614))
  val instToStepMap: Map[Int, Int] = Map(13614 -> 0, 13615 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13615, 13614))
  /* Beautified form:
  "PrimaryExpression4AssignmentTargetType0" (this, ObjectLiteral) => return CONST_invalid
  */
}
