package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression12IsFunctionDefinition0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression12IsFunctionDefinition0""", List(Id("""this"""), Id("""CoverParenthesizedExpressionAndArrowParameterList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverParenthesizedExpressionAndArrowParameterList"""))), EStr("""CoveredParenthesizedExpression""")).setId(13517), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))).setId(13518), IAccess(Id("""__x1__"""), ERef(RefId(Id("""expr"""))), EStr("""IsFunctionDefinition""")).setId(13520), IReturn(ERef(RefId(Id("""__x1__""")))).setId(13521))).setId(13528))
  val instToStepMap: Map[Int, Int] = HashMap(13520 -> 1, 13521 -> 1, 13519 -> 0, 13522 -> 1, 13518 -> 0, 13517 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13519, 13518, 13517), 1 -> HashSet(13520, 13521, 13522))
  /* Beautified form:
  "PrimaryExpression12IsFunctionDefinition0" (this, CoverParenthesizedExpressionAndArrowParameterList) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredParenthesizedExpression")
    let expr = __x0__
    access __x1__ = (expr "IsFunctionDefinition")
    return __x1__
  }
  */
}
