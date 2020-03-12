package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression7AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression7AssignmentTargetType0""", List(Id("""this"""), Id("""GeneratorExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(13629))
  val instToStepMap: Map[Int, Int] = Map(13629 -> 0, 13630 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13629, 13630))
  /* Beautified form:
  "PrimaryExpression7AssignmentTargetType0" (this, GeneratorExpression) => return CONST_invalid
  */
}
