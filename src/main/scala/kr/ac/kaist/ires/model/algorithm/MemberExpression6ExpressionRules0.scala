package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression6ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression6ExpressionRules0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Arguments""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45838), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45839))).setId(45844))
  val instToStepMap: Map[Int, Int] = Map(45840 -> 0, 45838 -> 0, 45839 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45838, 45840, 45839))
  /* Beautified form:
  "MemberExpression6ExpressionRules0" (this, MemberExpression, Arguments) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
