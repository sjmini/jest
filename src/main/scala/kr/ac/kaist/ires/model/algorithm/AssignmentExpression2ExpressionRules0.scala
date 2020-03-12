package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AssignmentExpression2ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""AssignmentExpression2ExpressionRules0""", List(Id("""this"""), Id("""ArrowFunction""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45398), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45399))).setId(45404))
  val instToStepMap: Map[Int, Int] = Map(45398 -> 0, 45399 -> 0, 45400 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45398, 45399, 45400))
  /* Beautified form:
  "AssignmentExpression2ExpressionRules0" (this, ArrowFunction) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
