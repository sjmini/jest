package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CoverParenthesizedExpressionAndArrowParameterList0CoveredFormalsList0 {
  val length: Int = 0
  val func: Func = Func("""CoverParenthesizedExpressionAndArrowParameterList0CoveredFormalsList0""", List(Id("""this"""), Id("""Expression""")), None, IReturn(EParseSyntax(ERef(RefId(Id("""this"""))), EStr("""ArrowFormalParameters"""), List())).setId(38795))
  val instToStepMap: Map[Int, Int] = Map(38795 -> 0, 38796 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38795, 38796))
  /* Beautified form:
  "CoverParenthesizedExpressionAndArrowParameterList0CoveredFormalsList0" (this, Expression) => return (parse-syntax this "ArrowFormalParameters" )
  */
}
