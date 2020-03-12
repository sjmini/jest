package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression5ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression5ExpressionRules0""", List(Id("""this"""), Id("""FunctionExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45898), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45899))).setId(45904))
  val instToStepMap: Map[Int, Int] = Map(45898 -> 0, 45899 -> 0, 45900 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45900, 45899, 45898))
  /* Beautified form:
  "PrimaryExpression5ExpressionRules0" (this, FunctionExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
