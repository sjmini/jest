package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentExpression5ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression5ExpressionRules0""", List(Id("""this"""), Id("""LeftHandSideExpression"""), Id("""AssignmentOperator"""), Id("""AssignmentExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45428), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45429))).setId(45434))
  val instToStepMap: Map[Int, Int] = Map(45428 -> 0, 45429 -> 0, 45430 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45430, 45429, 45428))
  /* Beautified form:
  "AssignmentExpression5ExpressionRules0" (this, LeftHandSideExpression, AssignmentOperator, AssignmentExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
