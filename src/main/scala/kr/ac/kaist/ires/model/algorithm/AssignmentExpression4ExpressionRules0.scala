package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentExpression4ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression4ExpressionRules0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45418), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45419))).setId(45424))
  val instToStepMap: Map[Int, Int] = Map(45418 -> 0, 45419 -> 0, 45420 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45419, 45420, 45418))
  /* Beautified form:
  "AssignmentExpression4ExpressionRules0" (this, LeftHandSideExpression, AssignmentExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
