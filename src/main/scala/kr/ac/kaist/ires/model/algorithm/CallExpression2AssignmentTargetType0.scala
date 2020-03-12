package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CallExpression2AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression2AssignmentTargetType0""", List(Id("""this"""), Id("""ImportCall""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(16489))
  val instToStepMap: Map[Int, Int] = Map(16489 -> 0, 16490 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16489, 16490))
  /* Beautified form:
  "CallExpression2AssignmentTargetType0" (this, ImportCall) => return CONST_invalid
  */
}
