package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UpdateExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""UpdateExpression1ExpressionRules0""", List(Id("""this"""), Id("""LeftHandSideExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45638), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45639))).setId(45644))
  val instToStepMap: Map[Int, Int] = Map(45638 -> 0, 45639 -> 0, 45640 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45638, 45639, 45640))
  /* Beautified form:
  "UpdateExpression1ExpressionRules0" (this, LeftHandSideExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
