package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CoverCallExpressionAndAsyncArrowHead0CoveredAsyncArrowHead0 {
  val length: Int = 0
  val func: Func = Func("""CoverCallExpressionAndAsyncArrowHead0CoveredAsyncArrowHead0""", List(Id("""this"""), Id("""MemberExpression"""), Id("""Arguments""")), None, IReturn(EParseSyntax(ERef(RefId(Id("""this"""))), EStr("""AsyncArrowHead"""), List())).setId(44123))
  val instToStepMap: Map[Int, Int] = Map(44123 -> 0, 44124 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(44123, 44124))
  /* Beautified form:
  "CoverCallExpressionAndAsyncArrowHead0CoveredAsyncArrowHead0" (this, MemberExpression, Arguments) => return (parse-syntax this "AsyncArrowHead" )
  */
}
