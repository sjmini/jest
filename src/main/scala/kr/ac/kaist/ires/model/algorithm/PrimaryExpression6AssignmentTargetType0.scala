package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression6AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression6AssignmentTargetType0""", List(Id("""this"""), Id("""ClassExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(13624))
  val instToStepMap: Map[Int, Int] = Map(13624 -> 0, 13625 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13625, 13624))
  /* Beautified form:
  "PrimaryExpression6AssignmentTargetType0" (this, ClassExpression) => return CONST_invalid
  */
}
