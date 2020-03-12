package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression12Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression12Evaluation0""", List(Id("""this"""), Id("""CoverParenthesizedExpressionAndArrowParameterList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverParenthesizedExpressionAndArrowParameterList"""))), EStr("""CoveredParenthesizedExpression""")).setId(16153), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))).setId(16154), IAccess(Id("""__x1__"""), ERef(RefId(Id("""expr"""))), EStr("""Evaluation""")).setId(16157), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(16158), IReturn(ERef(RefId(Id("""__x2__""")))).setId(16159))).setId(16167))
  val instToStepMap: Map[Int, Int] = HashMap(16155 -> 0, 16159 -> 1, 16154 -> 0, 16158 -> 1, 16153 -> 0, 16160 -> 1, 16157 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16155, 16154, 16153), 1 -> HashSet(16159, 16158, 16160, 16157))
  /* Beautified form:
  "PrimaryExpression12Evaluation0" (this, CoverParenthesizedExpressionAndArrowParameterList) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredParenthesizedExpression")
    let expr = __x0__
    access __x1__ = (expr "Evaluation")
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
