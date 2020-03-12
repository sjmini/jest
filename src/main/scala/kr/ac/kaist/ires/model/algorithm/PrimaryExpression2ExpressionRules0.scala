package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression2ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression2ExpressionRules0""", List(Id("""this"""), Id("""Literal""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45868), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45869))).setId(45874))
  val instToStepMap: Map[Int, Int] = Map(45868 -> 0, 45869 -> 0, 45870 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45869, 45870, 45868))
  /* Beautified form:
  "PrimaryExpression2ExpressionRules0" (this, Literal) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
