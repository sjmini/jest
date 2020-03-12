package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ExponentiationExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""ExponentiationExpression1ExpressionRules0""", List(Id("""this"""), Id("""UpdateExpression"""), Id("""ExponentiationExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45628), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45629))).setId(45634))
  val instToStepMap: Map[Int, Int] = Map(45628 -> 0, 45629 -> 0, 45630 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45628, 45629, 45630))
  /* Beautified form:
  "ExponentiationExpression1ExpressionRules0" (this, UpdateExpression, ExponentiationExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
