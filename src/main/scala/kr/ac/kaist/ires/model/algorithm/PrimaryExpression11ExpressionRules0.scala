package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression11ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression11ExpressionRules0""", List(Id("""this"""), Id("""TemplateLiteral""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45958), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45959))).setId(45964))
  val instToStepMap: Map[Int, Int] = Map(45958 -> 0, 45959 -> 0, 45960 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45960, 45959, 45958))
  /* Beautified form:
  "PrimaryExpression11ExpressionRules0" (this, TemplateLiteral) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
