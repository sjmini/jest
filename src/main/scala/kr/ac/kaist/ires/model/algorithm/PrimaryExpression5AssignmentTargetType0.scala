package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression5AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression5AssignmentTargetType0""", List(Id("""this"""), Id("""FunctionExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(13619))
  val instToStepMap: Map[Int, Int] = Map(13619 -> 0, 13620 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13619, 13620))
  /* Beautified form:
  "PrimaryExpression5AssignmentTargetType0" (this, FunctionExpression) => return CONST_invalid
  */
}
