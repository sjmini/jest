package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression2ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression2ExpressionRules0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45518), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45519))).setId(45524))
  val instToStepMap: Map[Int, Int] = Map(45520 -> 0, 45518 -> 0, 45519 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45520, 45518, 45519))
  /* Beautified form:
  "RelationalExpression2ExpressionRules0" (this, RelationalExpression, ShiftExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
