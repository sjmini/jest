package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BitwiseANDExpression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""BitwiseANDExpression1AssignmentTargetType0""", List(Id("""this"""), Id("""BitwiseANDExpression"""), Id("""EqualityExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(21924))
  val instToStepMap: Map[Int, Int] = Map(21924 -> 0, 21925 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(21924, 21925))
  /* Beautified form:
  "BitwiseANDExpression1AssignmentTargetType0" (this, BitwiseANDExpression, EqualityExpression) => return CONST_invalid
  */
}
