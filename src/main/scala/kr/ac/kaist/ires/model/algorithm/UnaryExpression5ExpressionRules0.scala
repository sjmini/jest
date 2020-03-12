package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression5ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression5ExpressionRules0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45718), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45719))).setId(45724))
  val instToStepMap: Map[Int, Int] = Map(45718 -> 0, 45719 -> 0, 45720 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45719, 45720, 45718))
  /* Beautified form:
  "UnaryExpression5ExpressionRules0" (this, UnaryExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
