package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object UpdateExpression3ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""UpdateExpression3ExpressionRules0""", List(Id("""this"""), Id("""UnaryExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45658), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45659))).setId(45664))
  val instToStepMap: Map[Int, Int] = Map(45658 -> 0, 45659 -> 0, 45660 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45658, 45660, 45659))
  /* Beautified form:
  "UpdateExpression3ExpressionRules0" (this, UnaryExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
