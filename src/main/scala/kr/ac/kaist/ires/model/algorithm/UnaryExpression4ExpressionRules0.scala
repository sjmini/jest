package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression4ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression4ExpressionRules0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45708), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45709))).setId(45714))
  val instToStepMap: Map[Int, Int] = Map(45708 -> 0, 45709 -> 0, 45710 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45709, 45708, 45710))
  /* Beautified form:
  "UnaryExpression4ExpressionRules0" (this, UnaryExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
