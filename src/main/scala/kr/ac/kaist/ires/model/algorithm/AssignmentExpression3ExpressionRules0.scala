package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentExpression3ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression3ExpressionRules0""", List(Id("""this"""), Id("""AsyncArrowFunction""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45408), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45409))).setId(45414))
  val instToStepMap: Map[Int, Int] = Map(45408 -> 0, 45409 -> 0, 45410 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45408, 45410, 45409))
  /* Beautified form:
  "AssignmentExpression3ExpressionRules0" (this, AsyncArrowFunction) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
