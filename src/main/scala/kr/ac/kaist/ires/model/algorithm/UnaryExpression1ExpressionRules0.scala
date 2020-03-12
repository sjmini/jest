package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression1ExpressionRules0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45678), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45679))).setId(45684))
  val instToStepMap: Map[Int, Int] = Map(45680 -> 0, 45678 -> 0, 45679 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45680, 45679, 45678))
  /* Beautified form:
  "UnaryExpression1ExpressionRules0" (this, UnaryExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
