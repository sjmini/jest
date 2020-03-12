package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression5ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression5ExpressionRules0""", List(Id("""this"""), Id("""MetaProperty""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45828), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45829))).setId(45834))
  val instToStepMap: Map[Int, Int] = Map(45828 -> 0, 45829 -> 0, 45830 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45828, 45829, 45830))
  /* Beautified form:
  "MemberExpression5ExpressionRules0" (this, MetaProperty) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
