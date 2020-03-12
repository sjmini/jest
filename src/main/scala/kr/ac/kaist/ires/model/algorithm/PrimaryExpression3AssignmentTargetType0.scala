package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression3AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression3AssignmentTargetType0""", List(Id("""this"""), Id("""ArrayLiteral""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(13609))
  val instToStepMap: Map[Int, Int] = Map(13609 -> 0, 13610 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13609, 13610))
  /* Beautified form:
  "PrimaryExpression3AssignmentTargetType0" (this, ArrayLiteral) => return CONST_invalid
  */
}
