package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression12HasName0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression12HasName0""", List(Id("""this"""), Id("""CoverParenthesizedExpressionAndArrowParameterList""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CoverParenthesizedExpressionAndArrowParameterList"""))), EStr("""CoveredParenthesizedExpression""")).setId(13451), ILet(Id("""expr"""), ERef(RefId(Id("""__x0__""")))).setId(13452), IAccess(Id("""__x1__"""), ERef(RefId(Id("""expr"""))), EStr("""IsFunctionDefinition""")).setId(13454), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), IReturn(EBool(false)).setId(13455), ISeq(List()).setId(13468)).setId(13458), IAccess(Id("""__x2__"""), ERef(RefId(Id("""expr"""))), EStr("""HasName""")).setId(13460), IReturn(ERef(RefId(Id("""__x2__""")))).setId(13461))).setId(13472))
  val instToStepMap: Map[Int, Int] = HashMap(13462 -> 3, 13452 -> 0, 13456 -> 1, 13458 -> 2, 13451 -> 0, 13455 -> 1, 13459 -> 2, 13454 -> 2, 13453 -> 0, 13461 -> 3, 13460 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13452, 13451, 13453), 1 -> HashSet(13456, 13455), 2 -> HashSet(13458, 13459, 13454), 3 -> HashSet(13462, 13461, 13460))
  /* Beautified form:
  "PrimaryExpression12HasName0" (this, CoverParenthesizedExpressionAndArrowParameterList) => {
    access __x0__ = (CoverParenthesizedExpressionAndArrowParameterList "CoveredParenthesizedExpression")
    let expr = __x0__
    access __x1__ = (expr "IsFunctionDefinition")
    if (= __x1__ false) return false else {}
    access __x2__ = (expr "HasName")
    return __x2__
  }
  */
}
