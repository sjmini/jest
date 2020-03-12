package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression8ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression8ExpressionRules0""", List(Id("""this"""), Id("""AwaitExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45748), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45749))).setId(45754))
  val instToStepMap: Map[Int, Int] = Map(45748 -> 0, 45749 -> 0, 45750 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45750, 45749, 45748))
  /* Beautified form:
  "UnaryExpression8ExpressionRules0" (this, AwaitExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
