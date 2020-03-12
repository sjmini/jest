package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression2AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression2AssignmentTargetType0""", List(Id("""this"""), Id("""Literal""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(13604))
  val instToStepMap: Map[Int, Int] = Map(13604 -> 0, 13605 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13604, 13605))
  /* Beautified form:
  "PrimaryExpression2AssignmentTargetType0" (this, Literal) => return CONST_invalid
  */
}
