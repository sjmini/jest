package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression10AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression10AssignmentTargetType0""", List(Id("""this"""), Id("""RegularExpressionLiteral""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(13644))
  val instToStepMap: Map[Int, Int] = Map(13644 -> 0, 13645 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13644, 13645))
  /* Beautified form:
  "PrimaryExpression10AssignmentTargetType0" (this, RegularExpressionLiteral) => return CONST_invalid
  */
}
