package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CallExpression5AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression5AssignmentTargetType0""", List(Id("""this"""), Id("""CallExpression"""), Id("""IdentifierName""")), None, IReturn(ERef(RefId(Id("""CONST_simple""")))).setId(16459))
  val instToStepMap: Map[Int, Int] = Map(16459 -> 0, 16460 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16459, 16460))
  /* Beautified form:
  "CallExpression5AssignmentTargetType0" (this, CallExpression, IdentifierName) => return CONST_simple
  */
}
