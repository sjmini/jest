package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BitwiseANDExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""BitwiseANDExpression1ExpressionRules0""", List(Id("""this"""), Id("""BitwiseANDExpression"""), Id("""EqualityExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45438), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45439))).setId(45444))
  val instToStepMap: Map[Int, Int] = Map(45440 -> 0, 45438 -> 0, 45439 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45440, 45438, 45439))
  /* Beautified form:
  "BitwiseANDExpression1ExpressionRules0" (this, BitwiseANDExpression, EqualityExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
