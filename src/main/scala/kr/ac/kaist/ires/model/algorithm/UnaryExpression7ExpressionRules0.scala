package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UnaryExpression7ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""UnaryExpression7ExpressionRules0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45738), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45739))).setId(45744))
  val instToStepMap: Map[Int, Int] = Map(45738 -> 0, 45739 -> 0, 45740 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45740, 45739, 45738))
  /* Beautified form:
  "UnaryExpression7ExpressionRules0" (this, UnaryExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
