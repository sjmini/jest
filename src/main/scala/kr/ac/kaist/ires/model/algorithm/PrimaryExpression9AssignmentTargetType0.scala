package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression9AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression9AssignmentTargetType0""", List(Id("""this"""), Id("""AsyncGeneratorExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(13639))
  val instToStepMap: Map[Int, Int] = Map(13639 -> 0, 13640 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13640, 13639))
  /* Beautified form:
  "PrimaryExpression9AssignmentTargetType0" (this, AsyncGeneratorExpression) => return CONST_invalid
  */
}
