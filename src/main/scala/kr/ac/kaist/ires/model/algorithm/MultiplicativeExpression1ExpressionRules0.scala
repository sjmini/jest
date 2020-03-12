package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MultiplicativeExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""MultiplicativeExpression1ExpressionRules0""", List(Id("""this"""), Id("""MultiplicativeExpression"""), Id("""MultiplicativeOperator"""), Id("""ExponentiationExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45618), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45619))).setId(45624))
  val instToStepMap: Map[Int, Int] = Map(45618 -> 0, 45619 -> 0, 45620 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45620, 45619, 45618))
  /* Beautified form:
  "MultiplicativeExpression1ExpressionRules0" (this, MultiplicativeExpression, MultiplicativeOperator, ExponentiationExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
