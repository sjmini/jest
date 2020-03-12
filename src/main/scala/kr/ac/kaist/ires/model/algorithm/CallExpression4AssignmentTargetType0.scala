package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CallExpression4AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""CallExpression4AssignmentTargetType0""", List(Id("""this"""), Id("""CallExpression"""), Id("""Expression""")), None, IReturn(ERef(RefId(Id("""CONST_simple""")))).setId(16454))
  val instToStepMap: Map[Int, Int] = Map(16454 -> 0, 16455 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16455, 16454))
  /* Beautified form:
  "CallExpression4AssignmentTargetType0" (this, CallExpression, Expression) => return CONST_simple
  */
}
