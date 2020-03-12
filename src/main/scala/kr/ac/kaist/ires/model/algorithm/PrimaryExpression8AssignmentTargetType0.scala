package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression8AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression8AssignmentTargetType0""", List(Id("""this"""), Id("""AsyncFunctionExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(13634))
  val instToStepMap: Map[Int, Int] = Map(13634 -> 0, 13635 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13635, 13634))
  /* Beautified form:
  "PrimaryExpression8AssignmentTargetType0" (this, AsyncFunctionExpression) => return CONST_invalid
  */
}
