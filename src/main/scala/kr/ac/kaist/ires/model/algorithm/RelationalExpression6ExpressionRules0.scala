package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression6ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression6ExpressionRules0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45558), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45559))).setId(45564))
  val instToStepMap: Map[Int, Int] = Map(45558 -> 0, 45559 -> 0, 45560 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45559, 45558, 45560))
  /* Beautified form:
  "RelationalExpression6ExpressionRules0" (this, RelationalExpression, ShiftExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
