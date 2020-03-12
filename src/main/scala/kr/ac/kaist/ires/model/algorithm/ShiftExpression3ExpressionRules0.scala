package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ShiftExpression3ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""ShiftExpression3ExpressionRules0""", List(Id("""this"""), Id("""ShiftExpression"""), Id("""AdditiveExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45588), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45589))).setId(45594))
  val instToStepMap: Map[Int, Int] = Map(45588 -> 0, 45589 -> 0, 45590 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45589, 45590, 45588))
  /* Beautified form:
  "ShiftExpression3ExpressionRules0" (this, ShiftExpression, AdditiveExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
