package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UpdateExpression2ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""UpdateExpression2ExpressionRules0""", List(Id("""this"""), Id("""LeftHandSideExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45648), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45649))).setId(45654))
  val instToStepMap: Map[Int, Int] = Map(45648 -> 0, 45649 -> 0, 45650 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45649, 45648, 45650))
  /* Beautified form:
  "UpdateExpression2ExpressionRules0" (this, LeftHandSideExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
