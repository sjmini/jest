package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression8AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression8AssignmentTargetType0""", List(Id("""this"""), Id("""AwaitExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(19098))
  val instToStepMap: Map[Int, Int] = Map(19098 -> 0, 19099 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19098, 19099))
  /* Beautified form:
  "UnaryExpression8AssignmentTargetType0" (this, AwaitExpression) => return CONST_invalid
  */
}
