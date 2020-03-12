package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object PrimaryExpression12IsIdentifierRef0 {
  val length: Int = 0
  val func: Func = Func("""PrimaryExpression12IsIdentifierRef0""", List(Id("""this"""), Id("""CoverParenthesizedExpressionAndArrowParameterList""")), None, IReturn(EBool(false)).setId(13594))
  val instToStepMap: Map[Int, Int] = Map(13594 -> 0, 13595 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13594, 13595))
  /* Beautified form:
  "PrimaryExpression12IsIdentifierRef0" (this, CoverParenthesizedExpressionAndArrowParameterList) => return false
  */
}
