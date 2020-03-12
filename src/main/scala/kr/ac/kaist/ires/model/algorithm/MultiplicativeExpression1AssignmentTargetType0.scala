package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MultiplicativeExpression1AssignmentTargetType0 {
  val length: Int = 0
  val func: Func = Func("""MultiplicativeExpression1AssignmentTargetType0""", List(Id("""this"""), Id("""MultiplicativeExpression"""), Id("""MultiplicativeOperator"""), Id("""ExponentiationExpression""")), None, IReturn(ERef(RefId(Id("""CONST_invalid""")))).setId(19835))
  val instToStepMap: Map[Int, Int] = Map(19835 -> 0, 19836 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(19836, 19835))
  /* Beautified form:
  "MultiplicativeExpression1AssignmentTargetType0" (this, MultiplicativeExpression, MultiplicativeOperator, ExponentiationExpression) => return CONST_invalid
  */
}
