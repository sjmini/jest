package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ShiftExpression2ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""ShiftExpression2ExpressionRules0""", List(Id("""this"""), Id("""ShiftExpression"""), Id("""AdditiveExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45578), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45579))).setId(45584))
  val instToStepMap: Map[Int, Int] = Map(45578 -> 0, 45579 -> 0, 45580 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45578, 45579, 45580))
  /* Beautified form:
  "ShiftExpression2ExpressionRules0" (this, ShiftExpression, AdditiveExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
