package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BitwiseORExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""BitwiseORExpression1ExpressionRules0""", List(Id("""this"""), Id("""BitwiseORExpression"""), Id("""BitwiseXORExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45458), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45459))).setId(45464))
  val instToStepMap: Map[Int, Int] = Map(45458 -> 0, 45459 -> 0, 45460 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45459, 45458, 45460))
  /* Beautified form:
  "BitwiseORExpression1ExpressionRules0" (this, BitwiseORExpression, BitwiseXORExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
