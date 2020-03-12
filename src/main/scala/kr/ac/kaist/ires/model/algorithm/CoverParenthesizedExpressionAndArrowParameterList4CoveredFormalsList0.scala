package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CoverParenthesizedExpressionAndArrowParameterList4CoveredFormalsList0 {
  val length: Int = 0
  val func: Func = Func("""CoverParenthesizedExpressionAndArrowParameterList4CoveredFormalsList0""", List(Id("""this"""), Id("""BindingPattern""")), None, IReturn(EParseSyntax(ERef(RefId(Id("""this"""))), EStr("""ArrowFormalParameters"""), List())).setId(38810))
  val instToStepMap: Map[Int, Int] = Map(38810 -> 0, 38811 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(38810, 38811))
  /* Beautified form:
  "CoverParenthesizedExpressionAndArrowParameterList4CoveredFormalsList0" (this, BindingPattern) => return (parse-syntax this "ArrowFormalParameters" )
  */
}
