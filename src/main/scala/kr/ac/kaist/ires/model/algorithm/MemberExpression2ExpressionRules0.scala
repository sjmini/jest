package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MemberExpression2ExpressionRules0 {
  val length: Int = 0
  val func: Func = Func("""MemberExpression2ExpressionRules0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""IdentifierName""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(45808), IReturn(ERef(RefId(Id("""__x0__""")))).setId(45809))).setId(45814))
  val instToStepMap: Map[Int, Int] = Map(45808 -> 0, 45809 -> 0, 45810 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(45810, 45808, 45809))
  /* Beautified form:
  "MemberExpression2ExpressionRules0" (this, MemberExpression, IdentifierName) => {
    app __x0__ = (WrapCompletion false)
    return __x0__
  }
  */
}
