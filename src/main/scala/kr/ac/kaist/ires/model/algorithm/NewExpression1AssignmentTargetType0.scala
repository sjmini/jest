package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object NewExpression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""NewExpression1AssignmentTargetType0""", List(Id("""this"""), Id("""NewExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(16504))
  val instToStepMap: Map[Int, Int] = Map(16504 -> 0, 16505 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16504, 16505))
  /* Beautified form:
  "NewExpression1AssignmentTargetType0" (this, NewExpression) => return CONST_invalid
  */
}
