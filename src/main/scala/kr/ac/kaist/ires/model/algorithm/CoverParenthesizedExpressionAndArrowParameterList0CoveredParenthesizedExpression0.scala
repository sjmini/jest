package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CoverParenthesizedExpressionAndArrowParameterList0CoveredParenthesizedExpression0 {
  val length: Int = 0
  val func: Func = Func("""CoverParenthesizedExpressionAndArrowParameterList0CoveredParenthesizedExpression0""", List(Id("""this"""), Id("""Expression""")), None, IReturn(EParseSyntax(ERef(RefId(Id("""this"""))), EStr("""ParenthesizedExpression"""), List())).setId(13446))
  val instToStepMap: Map[Int, Int] = Map(13446 -> 0, 13447 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13447, 13446))
  /* Beautified form:
  "CoverParenthesizedExpressionAndArrowParameterList0CoveredParenthesizedExpression0" (this, Expression) => return (parse-syntax this "ParenthesizedExpression" )
  */
}
