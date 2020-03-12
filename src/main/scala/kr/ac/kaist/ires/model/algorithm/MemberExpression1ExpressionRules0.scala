package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression1ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression1ExpressionRules0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Expression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45798), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45799))).setId(45804))
  val instToStepMap: Map[Int, Int] = Map(45798 -> 0, 45799 -> 0, 45800 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45800, 45798, 45799))
  /* Beautified form:
  "MemberExpression1ExpressionRules0" (this, MemberExpression, Expression) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
