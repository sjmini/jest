package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AdditiveExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""AdditiveExpression1ExpressionRules0""", List(Id("""this"""), Id("""AdditiveExpression"""), Id("""MultiplicativeExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45598), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45599))).setId(45604))
  val instToStepMap: Map[Int, Int] = Map(45600 -> 0, 45598 -> 0, 45599 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45599, 45600, 45598))
  /* Beautified form:
  "AdditiveExpression1ExpressionRules0" (this, AdditiveExpression, MultiplicativeExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
