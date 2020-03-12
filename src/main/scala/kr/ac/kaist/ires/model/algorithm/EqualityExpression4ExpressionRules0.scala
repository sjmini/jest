package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object EqualityExpression4ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""EqualityExpression4ExpressionRules0""", List(Id("""this"""), Id("""EqualityExpression"""), Id("""RelationalExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45498), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45499))).setId(45504))
  val instToStepMap: Map[Int, Int] = Map(45498 -> 0, 45499 -> 0, 45500 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45498, 45499, 45500))
  /* Beautified form:
  "EqualityExpression4ExpressionRules0" (this, EqualityExpression, RelationalExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
