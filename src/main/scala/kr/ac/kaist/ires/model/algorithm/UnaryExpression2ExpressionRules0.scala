package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression2ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression2ExpressionRules0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45688), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45689))).setId(45694))
  val instToStepMap: Map[Int, Int] = Map(45688 -> 0, 45689 -> 0, 45690 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45690, 45689, 45688))
  /* Beautified form:
  "UnaryExpression2ExpressionRules0" (this, UnaryExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
