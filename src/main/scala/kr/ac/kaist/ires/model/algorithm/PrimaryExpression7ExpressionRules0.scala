package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression7ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression7ExpressionRules0""", List(Id("""this"""), Id("""GeneratorExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45918), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45919))).setId(45924))
  val instToStepMap: Map[Int, Int] = Map(45920 -> 0, 45918 -> 0, 45919 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45918, 45919, 45920))
  /* Beautified form:
  "PrimaryExpression7ExpressionRules0" (this, GeneratorExpression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
