package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression0AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression0AssignmentTargetType0""", List(Id("""this""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(13599))
  val instToStepMap: Map[Int, Int] = Map(13600 -> 0, 13599 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13600, 13599))
  /* Beautified form:
  "PrimaryExpression0AssignmentTargetType0" (this) => return CONST_invalid
  */
}
