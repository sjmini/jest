package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CallExpression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression1AssignmentTargetType0""", List(Id("""this"""), Id("""SuperCall""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(16484))
  val instToStepMap: Map[Int, Int] = Map(16484 -> 0, 16485 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16484, 16485))
  /* Beautified form:
  "CallExpression1AssignmentTargetType0" (this, SuperCall) => return CONST_invalid
  */
}
