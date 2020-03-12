package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BitwiseXORExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""BitwiseXORExpression1ExpressionRules0""", List(Id("""this"""), Id("""BitwiseXORExpression"""), Id("""BitwiseANDExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45448), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45449))).setId(45454))
  val instToStepMap: Map[Int, Int] = Map(45448 -> 0, 45449 -> 0, 45450 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45448, 45449, 45450))
  /* Beautified form:
  "BitwiseXORExpression1ExpressionRules0" (this, BitwiseXORExpression, BitwiseANDExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
