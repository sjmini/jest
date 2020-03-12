package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression4ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression4ExpressionRules0""", List(Id("""this"""), Id("""SuperProperty""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45818), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45819))).setId(45824))
  val instToStepMap: Map[Int, Int] = Map(45818 -> 0, 45819 -> 0, 45820 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45818, 45820, 45819))
  /* Beautified form:
  "MemberExpression4ExpressionRules0" (this, SuperProperty) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
