package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ShiftExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""ShiftExpression1ExpressionRules0""", List(Id("""this"""), Id("""ShiftExpression"""), Id("""AdditiveExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45568), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45569))).setId(45574))
  val instToStepMap: Map[Int, Int] = Map(45568 -> 0, 45569 -> 0, 45570 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45570, 45569, 45568))
  /* Beautified form:
  "ShiftExpression1ExpressionRules0" (this, ShiftExpression, AdditiveExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
