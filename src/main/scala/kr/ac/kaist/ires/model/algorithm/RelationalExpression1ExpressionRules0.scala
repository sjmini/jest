package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression1ExpressionRules0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45508), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45509))).setId(45514))
  val instToStepMap: Map[Int, Int] = Map(45508 -> 0, 45509 -> 0, 45510 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45508, 45510, 45509))
  /* Beautified form:
  "RelationalExpression1ExpressionRules0" (this, RelationalExpression, ShiftExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
