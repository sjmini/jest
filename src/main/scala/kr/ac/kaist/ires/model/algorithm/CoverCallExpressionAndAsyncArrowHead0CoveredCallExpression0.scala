package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CoverCallExpressionAndAsyncArrowHead0CoveredCallExpression0 {
  val length: Int = 0
  val func: Func = Func("""CoverCallExpressionAndAsyncArrowHead0CoveredCallExpression0""", List(Id("""this"""), Id("""CoverCallExpressionAndAsyncArrowHead""")), None, IReturn(EParseSyntax(ERef(RefId(Id("""this"""))), EStr("""CallMemberExpression"""), List())).setId(16189))
  val instToStepMap: Map[Int, Int] = Map(16189 -> 0, 16190 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(16189, 16190))
  /* Beautified form:
  "CoverCallExpressionAndAsyncArrowHead0CoveredCallExpression0" (this, CoverCallExpressionAndAsyncArrowHead) => return (parse-syntax this "CallMemberExpression" )
  */
}
